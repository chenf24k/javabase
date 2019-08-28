package primer.file_t;

import java.io.File;

/**
 * @author 陈枫 on 2019-07-26.
 */
public class TestFile {
    public static void main(String[] args) {
        File f1 = new File("c:\\test\\logsmsb2.log");

        if (f1.isFile()) {
            System.out.println("是一个文件");
            System.out.println(f1.getAbsoluteFile());
        }
        if (f1.isDirectory()) {
            System.out.println("是一个目录");
        }
    }
}

