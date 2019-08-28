package com.chenfeng.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author 陈枫 on 2019-05-11.
 * 使用反射的读取注解的信息，模拟处理注解信息的流程
 */

public class Demo03 {

    // 获取该类中的所有注解
    public static void test() {
        try {
            Class c = Class.forName("annotation.SxtStudent");
            Annotation[] annotations = c.getAnnotations();
            for (Annotation i : annotations) {
                System.out.println(i);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    // 获得类的指定的注解
    public static void test2() {

        try {
            Class c = Class.forName("annotation.SxtStudent");
            SxtTable sxtTable = (SxtTable) c.getAnnotation(SxtTable.class);
            System.out.println(sxtTable.value());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 获取类属性的注解
    public static void test3() {
        try {
            Class c = Class.forName("annotation.SxtStudent");
            Field f = c.getDeclaredField("studentName");
            SxtField sxtField = f.getAnnotation(SxtField.class);
            System.out.println(sxtField.columnName() + "--" + sxtField.type() + "--" + sxtField.length());

        } catch (ClassNotFoundException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    // 根据获得的表名，字段信息，拼出DDL语句，然后，使用JDBC执行SQL，在数据库中生成相关的表

    public static void main(String[] args) throws ClassNotFoundException {
        test();
        test2();
        test3();
    }
}
