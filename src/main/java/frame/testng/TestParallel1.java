package frame.testng;

import org.testng.annotations.Test;

/**
 * @author 陈枫 on 2019-08-22.
 *
 * 在TestNG.xml中通过制定 parallel的运行级别（suite,test,class,method）以及thread-count的值来实现并发运行测试用例。
 * 一个TestNG.xml中通常只有一个suite，并发级别通常配置为test,class,method:
 * • parallel=test 意味着suite中的不同test标签下的测试类会并发执行，但同一test标签下的测试类会顺序执行
 * • parallel=class 意味着test标签下的不同测试类会并发执行，但同一个测试类里的方法会顺序执行
 * • paralle=method 意味着测试类里的方法会并发执行，这是并发的最大级别
 */
public class TestParallel1 {

    @Test
    public void test1() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("兔子跑1-" + i + "步");
        }
    }

    @Test
    public void test2() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("兔子跑2-" + i + "步");
        }
    }
}
