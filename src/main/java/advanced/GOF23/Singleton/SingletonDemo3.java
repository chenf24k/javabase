package advanced.GOF23.Singleton;

/**
 * 单例模式 -懒汉式
 *
 * @author 陈枫 on 2019-09-19.
 */
public class SingletonDemo3 {

    private static class SingletonClassInstance {
        private static final SingletonDemo3 instance = new SingletonDemo3();
    }

    public static SingletonDemo3 getInstance() {
        return SingletonClassInstance.instance;
    }

    private SingletonDemo3() {
    }
}