package com.chenfeng.javassist;

import javassist.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author 陈枫 on 2019-05-12.
 * 测试javassist的API
 */
public class Demo02 {

    /**
     * 处理类的基本用法
     *
     * @throws NotFoundException
     * @throws IOException
     * @throws CannotCompileException
     */
    public static void test01() throws NotFoundException, IOException, CannotCompileException {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.get("javassist.Emp");

        byte[] bytes = ctClass.toBytecode();
        System.out.println(Arrays.toString(bytes));
        System.out.println(ctClass.getName());
        System.out.println(ctClass.getSimpleName());
        System.out.println(ctClass.getSuperclass());
        System.out.println(ctClass.getInterfaces());
    }

    public static void test02() throws NotFoundException, CannotCompileException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.get("javassist.Emp");

        // CtMethod m = CtNewMethod.make("public int add(int a,int b){return a+b;}", ctClass);

        CtMethod m = new CtMethod(CtClass.intType, "add", new CtClass[]{CtClass.intType, CtClass.intType}, ctClass);
        m.setModifiers(Modifier.PUBLIC);
        m.setBody("{System.out.println(\"www.chenfeng.cn\");return $1+$2;}");
        ctClass.addMethod(m);

        // 通过反射调用新的方法
        Class clazz = ctClass.toClass();
        Object object = clazz.newInstance(); //通过调用Emp无参构造器，创建新的Emp对象
        Method method = clazz.getDeclaredMethod("add", int.class, int.class);
        Object result = method.invoke(object, 200, 300);
        System.out.println(result);
    }

    public static void test03() throws NotFoundException, CannotCompileException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.get("javassist.Emp");

        CtMethod ctMethod = ctClass.getDeclaredMethod("sayHello", new CtClass[]{CtClass.intType});
        ctMethod.insertBefore("System.out.println($1);System.out.println(\"start!!!\");");

        Class clazz = ctClass.toClass();
        Object object = clazz.newInstance(); //通过调用Emp无参构造器，创建新的Emp对象
        Method method = clazz.getDeclaredMethod("sayHello", int.class);
        Object result = method.invoke(object, 300);
        System.out.println(result);

    }

    public static void main(String[] args) throws IOException, CannotCompileException, NotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        // test01();
        // test02();
        test03();
    }

}
