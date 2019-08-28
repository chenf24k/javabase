package primer.object_t;

/**
 * @author 陈枫 on 2019-06-30.
 */
public class TestObject {
    public static void main(String[] args) {
        Object obj = "你好";

        System.out.println(obj.getClass().getName());
        // 控制台输出:java.lang.String
        System.out.println(obj.getClass().getSimpleName());
        // 控制台输出: String
        System.out.println(obj.getClass().getMethods());
        // 控制台输出:[Ljava.lang.reflect.Method;@511d50c0


        TestObject to = new TestObject();
        System.out.println(to.toString()
                .equals(to.getClass().getName()
                        + "@"
                        + Integer.toHexString(to.hashCode())
                )
        );

        Person2 p = new Person2("陈枫", 25);
        System.out.println(p.toString());
        Person2 p2 = new Person2();


    }

    /*@Override
    public String toString() {
        return "测试Object对象";
    }*/
}

