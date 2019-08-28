package frame.testng;

import org.testng.annotations.Test;

/**
 * @author 陈枫 on 2019-08-22.
 */
public class TestParallel2 {

    @Test
    public void test1() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("乌龟跑" + i + "步");
        }
    }
}
