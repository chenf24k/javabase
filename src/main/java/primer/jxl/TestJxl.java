package primer.jxl;

import jxl.Range;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author 陈枫 on 2019-08-03.
 */
public class TestJxl {
    public static void main(String[] args) throws IOException, BiffException {
        Workbook workbook = Workbook.getWorkbook(new File("C:/test/社区123.xls"));
        Sheet sheet = workbook.getSheet(0);

        int cols = sheet.getColumns();//得到所有的列
        int rows = sheet.getRows();   //得到所有的行
        System.out.println("列数：" + cols + "行数:" + rows);

        Range[] rangeCell = sheet.getMergedCells();
        for (int i = 1; i < sheet.getRows(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < sheet.getColumns(); j++) {
                String str = null;
                str = sheet.getCell(j, i).getContents();
                for (Range r : rangeCell) {
                    if (i > r.getTopLeft().getRow()
                            && i <= r.getBottomRight().getRow()
                            && j >= r.getTopLeft().getColumn()
                            && j <= r.getBottomRight().getColumn()) {
                        str = sheet.getCell(r.getTopLeft().getColumn(),
                                r.getTopLeft().getRow()).getContents();
                    }
                }
                System.out.print(str + " ");
                sb.append(str + "-");
            }
            System.out.println(sb);
            String[] list = sb.toString().split("-");
            System.out.println(list.length);
            System.out.println(Arrays.toString(list));
            System.out.println();
        }
        workbook.close();
    }
}
