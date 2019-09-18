package primer.thread_t.sleep;

/**
 * 模拟网络延迟
 *
 * @author 陈枫 on 2019-09-07.
 */
public class TestSleep2 {
    public static void main(String[] args) {
        Web12306 web = new Web12306();

        Thread t1 = new Thread(web, "学生甲");
        Thread t2 = new Thread(web, "民工乙");
        Thread t3 = new Thread(web, "黄牛丙");

        t1.start();
        t2.start();
        t3.start();
    }

}

class Web12306 implements Runnable {
    private static int num = 5000;

    private static void qiangPiao() {
        num--;
    }

    @Override
    public void run() {
        while (true) {
            qiangPiao();
            if (num <= 0)
                break;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "抢到了" + num);
        }
    }

}
