package advanced.reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 陈枫 on 2019-09-15.
 */
public class Demo01 {
    public static void main(String[] args) {
        String path = "advanced.reflection.bean.User";

        try {
            Class clazz = Class.forName(path);
            // 获取类名
            System.out.println(clazz.getName());
            System.out.println(clazz.getSimpleName());

            // 获得属性，只能获得公开属性
            //  Field[] fields = clazz.getFields();
            // 获取声明的属性
            Field[] fields = clazz.getDeclaredFields();
            System.out.println(fields.length);


            for (Field temp : fields) {
                System.out.println(temp.getName());
                System.out.println(temp);
            }
            Method[] methods = clazz.getDeclaredMethods();
            for (Method temp : methods) {
                System.out.println(temp.getName());
            }

            Method m01 = clazz.getDeclaredMethod("getUname", null);
            Method m02 = clazz.getDeclaredMethod("setUname", String.class);
            System.out.println("获取没有参数方法:" + m01.getName() + "\r\n" + "获取有参数的方法:" + m02.getName());

            Constructor[] constructors = clazz.getDeclaredConstructors();
            Constructor constructorWithNoParameter = clazz.getDeclaredConstructor(int.class, int.class, String.class);
            System.out.println("获取带参构造器:" + constructorWithNoParameter);
            for (Constructor temp : constructors) {
                System.out.println("获取构造器:" + temp);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
