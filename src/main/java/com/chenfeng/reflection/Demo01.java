package com.chenfeng.reflection;

/**
 * @author 陈枫 on 2019-05-11.
 * 测试java.lang.Class对象的获取方式
 */
public class Demo01 {
    public static void main(String[] args) {
        String path = "reflection.com.chenfeng.bean.User";
        try {
            Class<?> c = Class.forName(path);
            // 对象是表示或封装一些数据。 一个类被加载后，JVM会创建一个对应该类的Class对象，类的整个结构信息会放到对应的Class对象中
            // 这个Class对象就像一面镜子一样，通过这面镜子我们可以看到对应类的全部信息
            System.out.println(c);
            System.out.println(c.hashCode());

            Class<?> c2 = Class.forName(path);// 一个类只对应一个Class对象
            System.out.println(c2.hashCode());

            Class classStr = String.class;
            Class classStr2 = path.getClass();
            System.out.println(classStr);
            System.out.println(classStr2);
            System.out.println(classStr == classStr2);

            Class classInt = int.class;

            int[] arr01 = new int[10];
            int[] arr02 = new int[30];
            int[][] arr03 = new int[30][2];
            double[] arr04 = new double[10];
            System.out.println(arr01.getClass().hashCode());
            System.out.println(arr02.getClass().hashCode());
            System.out.println(arr03.getClass().hashCode());
            System.out.println(arr04.getClass().hashCode());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
