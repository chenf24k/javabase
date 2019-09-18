package primer.thread_t.extends_callable;

/**
 * @author 陈枫 on 2019-09-06.
 * 一.停止线程
 * 1.自然终止：线程体正常执行完毕
 * 2.外部干涉
 * -2.1 线程体中定义线程体使用的标识
 * -2.2 线程体使用该标识
 * -2.3 提供对外的方法改变该标识
 */
public class ThreadStatus {
    public static void main(String[] args) throws InterruptedException {
        Study study = new Study();
        Thread thread = new Thread(study);
        thread.start();
        Thread.sleep(3000);
//        for (int i = 0; i < 2000; i++) {
//            if (i == 500) {
                study.stop();
//            }
//            System.out.println("main--->" + i);
//        }
    }
}

class Study implements Runnable {
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            System.out.println("study thread...");
        }
    }

    public void stop() {
        this.flag = false;
    }
}



/*
 *                   阻塞状态
 *                /           /\
 *               \/            \
 * 创建-start()-就绪状态<-调度->运行状态->终止
 *
 */