package primer.thread_t.join_yield;

/**
 * @author 陈枫 on 2019-09-07.
 */
public class TestJoin extends Thread {
    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);// 新生
        thread.start();// 就绪
        // cpu调度即可运行
        for (int i = 0; i < 1000; i++) {
            if (50 == i) {
                thread.join(); // main方法阻塞
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
