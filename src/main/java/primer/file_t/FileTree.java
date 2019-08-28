package primer.file_t;

import java.io.File;

/**
 * @author 陈枫 on 2019-07-26.
 */
public class FileTree {
    public static void main(String[] args) {
        File f = new File("c:/test");
        printFile(f, 1);
    }

    static void printFile(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File temp : files) {
                printFile(temp, level + 1);
            }
        }
    }
}
