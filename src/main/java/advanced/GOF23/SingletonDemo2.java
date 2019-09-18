package advanced.GOF23;

/**
 * 单例模式 -懒汉式
 *
 * @author 陈枫 on 2019-09-19.
 */
public class SingletonDemo2 {

    private static SingletonDemo2 s = null;

    private SingletonDemo2() {
    }

    // 对象延迟加载
    // 资源利用率高了，但是每次调用getInstance()需要同步，并发访问效率低
    public static synchronized SingletonDemo2 getInstance() {
        if (s == null) {
            s = new SingletonDemo2();
        }
        return s;
    }
}
