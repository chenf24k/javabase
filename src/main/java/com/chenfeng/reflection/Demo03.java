package com.chenfeng.reflection;

import com.chenfeng.reflection.bean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 陈枫 on 2019-05-11.
 * 通过反射API动态的操作：构造器、方法、属性
 */
public class Demo03 {
    public static void main(String[] args) {

        String path = "reflection.com.chenfeng.bean.User";
        try {
            Class<User> c = (Class<User>) Class.forName(path);

            // 通过反射API动态操作构造器
            User user = c.newInstance(); //其实是调用了User的无参构造方法--其实javaBean必需要有无参构造器
            System.out.println(user);

            Constructor constructor = c.getDeclaredConstructor(int.class, int.class, String.class);
            User user2 = (User) constructor.newInstance(1001, 18, "陈枫2");
            System.out.println(user2.getUname());

            // 通过反射API动态调用普通方法
            User user3 = c.newInstance();
            Method method = c.getDeclaredMethod("setUname", String.class);
            method.invoke(user3, "陈枫3"); //等价于 user3.setUname("陈枫");
            System.out.println(user3.getUname());

            // 通过反射API操作属性
            Field f = c.getDeclaredField("uname");
            User user4 = c.newInstance();
            f.setAccessible(true);// 这个属性不需要做安全检查，可以直接访问
            f.set(user4, "陈枫4");// 通过反射直接写属性的值
            System.out.println(user4.getUname());// 通过反射直接读属性的值
            System.out.println(f.get(user4));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

