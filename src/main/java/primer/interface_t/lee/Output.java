package primer.interface_t.lee;

/**
 * 系统自动为解接口里定义的成员变量增加public static final修饰符
 * 接口里定义的内部类、内部接口、内部枚举默认都采用public static 修饰符
 * Java8 允许在接口中定义默认方法（即实例方法），默认方法必须用default修饰，该方法不能使用static修饰
 * Java8 允许在接口中定义类方法，类方法必须用static修饰，该方法不能用default修饰
 * Java9 增加了带方法体的私有方法
 */
public interface Output {

    //public static final int MAX_CACHE_LINE = 50;
    int MAX_CACHE_LINE = 50;


    void out();

    void getData(String msg);

    default void print(String... msgs) {
        for (String msg : msgs) {
            System.out.println(msg);
        }
    }

    default void test() {
        System.out.println("默认的test()方法");
    }

    static String staticTest() {
        return "接口里的类方法";
    }

    private void foo() {
        System.out.println("foo私有方法");
    }

    private static void bar() {
        System.out.println("bar私有静态方法");
    }
}
