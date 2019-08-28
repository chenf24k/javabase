package com.chenfeng.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 陈枫 on 2019-05-11.
 * 应用反射的API，获取类的信息（类名、属性、方法、构造器）
 */
public class Demo02 {
    public static void main(String[] args) {
        String path = "reflection.com.chenfeng.bean.User";
        try {
            Class<?> c = Class.forName(path);

            // 获取类名
            System.out.println(c.getName());// 包名+类名：reflection.com.chenfeng.bean.User
            System.out.println(c.getSimpleName());// 类名：User

            // 获取属性信息
            // Field[] fields = c.getFields("id");// 只能获取public修饰的field
            Field[] fields = c.getDeclaredFields(); // 可以获取到全部的field
            Field field = c.getDeclaredField("uname");
            System.out.println(fields.length);
            System.out.println(field);

            for (Field f : fields) {
                System.out.println("属性：" + f);
            }

            // 获取方法信息
            Method[] methods = c.getDeclaredMethods();
            Method method = c.getDeclaredMethod("getUname", null);
            Method method2 = c.getDeclaredMethod("setUname", String.class);// 如果方法需要有参，则必须传递参数的类型对应的class对象
            System.out.println(methods.length);
            System.out.println(method);
            System.out.println(method2);

            for (Method m : methods) {
                System.out.println("方法：" + m);
            }

            // 获取构造器信息
            Constructor[] constructors = c.getDeclaredConstructors();
            Constructor constructor1 = c.getDeclaredConstructor(null);
            Constructor constructor2 = c.getDeclaredConstructor(int.class, int.class, String.class);
            System.out.println(constructor1);
            System.out.println(constructor2);

            for (Constructor cc : constructors) {
                System.out.println("构造器：" + cc);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
