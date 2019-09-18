package advanced.GOF23;

/**
 * 单例模式-饿汉式
 *
 * @author 陈枫 on 2019-09-19.
 */
public class SingletonDemo1 {
    // 类初始化时，立即加载对象
    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1() {
    }

    // 方法没有同步块，调用效率高
    public static SingletonDemo1 getInstance() {
        return instance;
    }
}
