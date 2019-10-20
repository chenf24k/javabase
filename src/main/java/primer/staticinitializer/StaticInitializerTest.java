package primer.staticinitializer;

public class StaticInitializerTest {
    // 定义第一个初始化块
    {
        int a = 6;
        if (a > 4) {
            System.out.println("TestStaticInitializer初始化块：局部变量a的值大于4");
        }
        System.out.println("TestStaticInitializer的初始化块");
    }

    // 定义第二个初始化块
    {
        System.out.println("TestStaticInitializer的第二个初始化块");
    }

    // 定义无参构造器
    public StaticInitializerTest() {
        System.out.println("TestStaticInitializer的第二个初始化块的无参构造器");
    }

    public static void main(String[] args) {
        new StaticInitializerTest();
    }
}