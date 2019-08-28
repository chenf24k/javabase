package primer.object_t;

/**
 * @author 陈枫 on 2019-06-30.
 */
public class TestSuper2 {
    public static void main(String[] args) {
        System.out.println("开始创建一个ChildClass对象");
        new ChildClass2();
    }
}

class FatherClass2 {
    static {
        System.out.println("父类静态初始化块");
    }

    public FatherClass2() {
        System.out.println("创建FatherClass");
    }
}

class ChildClass2 extends FatherClass2 {
    static {
        System.out.println("子类静态初始化块");
    }

    public ChildClass2() {
        // 此处super();存在，默认调用父类的构造器
        System.out.println("创建ChildClass");
    }
}
