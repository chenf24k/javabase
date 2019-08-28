package primer.generics_t;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;

/**
 * @author 陈枫 on 2019-07-09.
 */
public class TTT {
    public static void main(String[] args) {
        File file = new File("c:/");
        String[] list;

        list = file.list();

        for (String name : list) {
            System.out.println(name);
        }


    }
}
