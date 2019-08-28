package primer.thread_t.extends_thread;

/**
 * @author 陈枫 on 2019-08-27.
 */
public class Dog extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("乌龟跑了" + i + "步");
        }
    }
}
