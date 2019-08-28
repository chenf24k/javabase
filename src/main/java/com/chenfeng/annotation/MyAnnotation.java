package com.chenfeng.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 元注解
 *
 * @Target 用于描述注解的使用范围
 * 包    PACKAGE
 * 类、接口、枚举、Annotation       TYPE
 * 类型成员（方法、构造器、成员变量、枚举值）        CONSTRUCTOR\FIELD\METHOD
 * 方法参数和本地参数        LOCAL_VARIABLE(局部变量)\PARAMETER（参数）
 * @Retention 表示需要在什么级别保存该注释信息，用于描述注解的声明周期
 * SOURCE 在源文件中有效（即源文件保留）
 * CLASS 在class文件中有效（即class保留）
 * RUNTIME 在运行时有效（即运行时保留），Runtime可以被反射机制读取
 */


@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String studentName() default "";

    int age() default 0;

    int id() default -1; // String indexOf("abc") -1;

    String[] schools() default {"清华大学", "陈枫"};
}
