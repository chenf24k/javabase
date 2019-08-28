package frame.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author 陈枫 on 2019-08-22.
 * -@Dataprovider 上配置多线程并发,配置parallel=true来实现数据驱动测试的并发
 * TestNG默认的dataprovider并发执行的线程数是10，要更改此限制，可以在TestNG.xml文件中配置data-provider-thread-count属性
 */
public class TestParallel3 {

    @DataProvider(name = "numPara", parallel = true)
    public Object[][] getDataPara() {
        return new Object[][]{
                {1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}, {10}, {11}
        };
    }

    @Test(dataProvider = "numPara")
    public void test1(int num) {
        for (int i = 0; i < 5; i++) {
            System.out.println(num);
        }
    }
}
