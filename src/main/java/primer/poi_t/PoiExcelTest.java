package primer.poi_t;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;

/**
 * @author 陈枫 on 2019-08-03.
 */
public class PoiExcelTest {
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
            // 得到有效行数
            int rowNumber = sheet.getPhysicalNumberOfRows();
            System.out.println("有效行数：" + rowNumber);
            // 读取行
            for (int rowIndex = 0; rowIndex < rowNumber; rowIndex++) {
                System.out.print("正在读取第" + (rowIndex + 1) + "行:");
                if (rowIndex < 3) {
                    System.out.println();
                    continue;
                }
                // 读取列
                HSSFRow row = sheet.getRow(rowIndex);
                for (int cellIndex = 0; cellIndex < 9; cellIndex++) {
                    HSSFCell cell = row.getCell(cellIndex);
                    switch (cell.getCellType()) {
                        case HSSFCell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + ":");
                            break;
                        case HSSFCell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + ":");
                            break;
                        default:
                            System.out.print(cell.getStringCellValue() + ":");
                            break;
                    }
                    if (cellIndex == 3) {
                        System.out.println();
                    }

                }
            }
        }

    }
}
