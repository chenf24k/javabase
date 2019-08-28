package primer.system_t;

import java.util.Properties;
import java.util.Set;

/**
 * System类
 *
 * @author 陈枫 on 2019-07-18.
 */
public class Test {
    public static void main(String[] args) {
        // printPropertiesList();
        //printCurrentTimeMillis();
        testArrayCopy();
    }

    public static void printPropertiesList() {
        Properties properties = System.getProperties();
        System.out.println(properties);

        Set<String> propertyNames = properties.stringPropertyNames();

        for (String key : propertyNames) {
            String value = System.getProperty(key);
            System.out.println(key + "--->" + value);
        }
    }

    public static void printCurrentTimeMillis() {
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间为:" + (endTime - startTime) + "毫秒");
    }

    public static void testArrayCopy() {
        int[] fromArray = {101, 102, 103, 104, 105, 106};
        int[] toArray = {201, 202, 203, 204, 205, 206, 207};
        System.arraycopy(fromArray, 1, toArray, 3, 4);
        System.out.println("正常退出");
        System.exit(0);
        for (int i : toArray) {
            System.out.println(i);
        }
    }
}
