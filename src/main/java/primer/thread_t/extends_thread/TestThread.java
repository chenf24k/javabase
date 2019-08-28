package primer.thread_t.extends_thread;

/**
 * 1.继承Thread
 * 2.重写run()方法
 * 3.调用start()方法
 *
 * @author 陈枫 on 2019-07-28.
 */
public class TestThread {
    public static void main(String[] args) {
        Rabbit rab = new Rabbit();
        Dog dog = new Dog();

        rab.start();
        dog.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main=>" + i);
        }
    }
}
