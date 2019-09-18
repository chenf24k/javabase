package primer.thread_t.info;

/**
 * Thread.currentThread()  当前线程
 * setName  设置名称
 * getName  获取名称
 * isAlive  判断状态
 *
 * @author 陈枫 on 2019-09-07.
 */
public class TestThreadInfo implements Runnable {
    private boolean flag = true;
    private int num = 0;


    @Override
    public void run() {
        while (flag) {
            System.out.println(Thread.currentThread().getName() + "-->" + num++);
        }
    }

    public void stop(boolean isStop) {
        this.flag = isStop;
    }

    public static void main(String[] args) throws InterruptedException {
        TestThreadInfo it = new TestThreadInfo();
        Thread proxy = new Thread(it, "挨踢");
        // proxy.setName("test");
        System.out.println(proxy.getName());
        System.out.println(Thread.currentThread().getName());
        proxy.start();
        System.out.println("启动后的状态：" + proxy.isAlive());
        Thread.sleep(20);
        it.stop(false);
        Thread.sleep(20);
        System.out.println("停止后的状态：" + proxy.isAlive());

    }
}
