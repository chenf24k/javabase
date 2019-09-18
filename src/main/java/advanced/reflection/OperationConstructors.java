package advanced.reflection;

import advanced.reflection.bean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * @author 陈枫 on 2019-09-15.
 */
public class OperationConstructors {
    public static void main(String[] args) {
        // 动态操作构造器
        String path = "advanced.reflection.bean.User";

        try {
            Class clazz = Class.forName(path);
            // Class<User> clazz = (Class<User>) Class.forName(path);
            // 通过反射API动态调用构造方法，构造对象
            User u = (User) clazz.newInstance();// 其实是调用了User的无参构造方法
            System.out.println(u);
            Constructor constructor = clazz.getDeclaredConstructor(int.class, int.class, String.class);
            User u2 = (User) constructor.newInstance(1001, 18, "陈枫");
            System.out.println(u2.getUname());

            // 通过反射API 调用普通方法
            User u3 = (User) clazz.newInstance();
            Method method = clazz.getDeclaredMethod("setUname", String.class);
            method.invoke(u3, "陈枫");
            System.out.println(u3.getUname());

            // 通过反射API 操作属性
            User u4 = (User) clazz.newInstance();
            Field f = clazz.getDeclaredField("uname");
            f.set(u4, "陈枫啊");
            System.out.println(u4.getUname());


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
