package primer.thread_t.thread_lifecycle;

/**
 * @author 陈枫 on 2019-08-28.
 */
public class Demo01 {
    public static void main(String[] args) {
        Study study = new Study();
        new Thread(study).start();

        for (int i = 0; i < 100; i++) {
            if (i == 50) { // 外部干预
                study.stop();
            }
            System.out.println("main..." + i);
        }

    }
}

class Study implements Runnable {
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            System.out.println("Study...ing...");
        }
    }

    public void stop() {
        this.flag = false;
    }
}
