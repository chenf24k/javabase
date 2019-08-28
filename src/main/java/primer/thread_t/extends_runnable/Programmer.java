package primer.thread_t.extends_runnable;

/**
 * 使用Runnable 创建线程
 * 1.实现Runnable接口+重写run()   -->真实角色类
 *
 * @author 陈枫 on 2019-08-28.
 */
public class Programmer implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("敲代码...");
        }
    }
}
