package primer.thread_t.join_yield;

/**
 * static void yield()
 * 暂停当前正在执行的线程对象，并执行其它线程
 *
 * @author 陈枫 on 2019-09-07.
 */
public class TestYield extends Thread {
    public static void main(String[] args) throws InterruptedException {
        TestYield testYield = new TestYield();
        Thread thread = new Thread(testYield);// 新生
        thread.start();// 就绪
        // cpu调度即可运行
        for (int i = 0; i < 1000; i++) {
            if (0 == i % 20) {
                Thread.yield(); // 暂停本线程main
            }
            System.out.println("main...>>" + i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("join...>>" + i);
        }
    }
}
