package primer.thread_t.info;


/**
 * 优先级
 * MAX_PRIORITY  10
 * NORM_PRIORITY  5(默认为5)
 * MIN_PRIORITY  1
 * <p>
 * setPriority()
 * 优先级不代表先后顺序，而是概率
 *
 * @author 陈枫 on 2019-09-08.
 */
public class TestThreadInfo2 {
    public static void main(String[] args) throws InterruptedException {
        TestThreadInfo ti1 = new TestThreadInfo();
        Thread p1 = new Thread(ti1, "挨踢1");
        TestThreadInfo ti2 = new TestThreadInfo();
        Thread p2 = new Thread(ti2, "挨踢2");

        p1.setPriority(Thread.MIN_PRIORITY);// 设置优先级
        p2.setPriority(Thread.MAX_PRIORITY);// 设置优先级
        p1.start();
        p2.start();

        Thread.sleep(100);

        ti1.stop(false);
        ti2.stop(false);
    }
}
