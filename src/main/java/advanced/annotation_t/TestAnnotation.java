package advanced.annotation_t;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 陈枫 on 2019-09-08.
 */
public class TestAnnotation {

    @Override
    public String toString() {
        return "";
    }

    @Deprecated
    public static void test01() {
        System.out.println("test01");
    }

    @SuppressWarnings(value = {"unchecked","deprecation"})
    public static void test02() {
        List list = new ArrayList();
    }


    public static void main(String[] args) {
        Date d = new Date();
        test01();
    }
}
