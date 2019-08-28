package primer.thread_t.extends_runnable;

/**
 * 推荐使用Runnable创建线程
 * 1.避免单继承的局限性
 * 2.便于共享资源
 * <p>
 * 使用Runnable 创建线程
 * 1.实现Runnable接口+重写run()   -->真实角色类
 * 2.启动多线程  使用静态代理
 * 1）.创建真实角色
 * 2）.创建代理角色+真实角色的引用
 * 3）.调用start()方法
 *
 * @author 陈枫 on 2019-08-28.
 */
public class ProgrammerApp {
    public static void main(String[] args) {
        Programmer pro1 = new Programmer();
        Thread proxy1 = new Thread(pro1);
        proxy1.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("聊QQ...");
        }
    }

}
