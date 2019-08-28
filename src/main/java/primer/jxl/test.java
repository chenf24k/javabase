package primer.jxl;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

/**
 * @author 陈枫 on 2019-08-03.
 */
public class test {
    public static void main(String[] args) throws IOException, BiffException {
        Workbook workbook = Workbook.getWorkbook(new File("C:/test/社区123.xls"));
        Sheet sheet = workbook.getSheet(0);

        int cols = sheet.getColumns();//得到所有的列
        int rows = sheet.getRows();   //得到所有的行
        System.out.println("列数：" + cols + "行数:" + rows);

        String all = null;

        for (int i = 1; i < rows; i++) { //行
            for (int j = 0; j < cols; j++) { // 列

                String name = sheet.getCell(j++, i).getContents();
                String action = sheet.getCell(j++, i).getContents();
                String event = sheet.getCell(j++, i).getContents();
                String type = sheet.getCell(j++, i).getContents();
                String attribute = sheet.getCell(j++, i).getContents();
                String value = sheet.getCell(j++, i).getContents();

                all = name + ":" + action + ":" + event + ":" + type + ":" + attribute + ":" + value;
                System.out.println(all);


                /*ExcelEntity entity = new ExcelEntity();
                entity.setName(name);
                entity.setSex(sex);
                entity.setNum(Integer.parseInt(num));
                list.add(entity);
*/


            }

        }
    }
}
