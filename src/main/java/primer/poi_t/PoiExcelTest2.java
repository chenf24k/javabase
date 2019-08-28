package primer.poi_t;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author 陈枫 on 2019-08-03.
 */
public class PoiExcelTest2 {
    public static void main(String[] args) throws IOException {
        // 读取数据流
        InputStream inp = new FileInputStream(new File("c:/test/666.xls"));
        // 解析工作簿
        HSSFWorkbook workbook = new HSSFWorkbook(inp);
        // 解析工作表
        int size = workbook.getNumberOfSheets();
        System.out.println("工作表的数量：" + size);
        for (int i = 0; i < size; i++) {
            HSSFSheet sheet = workbook.getSheetAt(i);
            System.out.println("工作表的名:" + sheet.getSheetName());

            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING://字符串
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print(" ");
                            break;
                        case Cell.CELL_TYPE_NUMERIC://数值与日期
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print(" ");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN://boolean类型
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print(" ");
                            break;
                        default:
                    }
                }
                System.out.println();
            }

        }

    }
}
