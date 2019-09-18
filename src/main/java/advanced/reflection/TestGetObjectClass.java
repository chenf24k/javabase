package advanced.reflection;

/**
 * 测试java.lang.Class对象的获取方式
 *
 * @author 陈枫 on 2019-09-14.
 */
public class TestGetObjectClass {
    public static void main(String[] args) {

        String path = "advanced.reflection.bean.User";

        try {
            Class clazz = Class.forName(path);
            // 对象是表示或封装一些数据。一个类被加载后，JVM会创建一个对应该类的Class对象，类的整个结构信息会放到对应的Class对象
            // 这个Class对象就像一面镜子一样，通过这面镜子我们可以看到对应类的全部信息。
            System.out.println(clazz);
            System.out.println(clazz.hashCode());

            Class clazz2 = Class.forName(path);
            System.out.println(clazz2.hashCode());
            System.out.println(clazz2.getName());
            System.out.println(clazz2.getSimpleName());


            int[] arr1 = new int[10];
            int[] arr2 = new int[10];
            int[] arr3 = new int[20];
            String[] arr4 = new String[10];
            System.out.println(arr1.getClass().hashCode());
            System.out.println(arr2.getClass().hashCode());
            System.out.println(arr3.getClass().hashCode());
            System.out.println(arr4.getClass().hashCode());


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
