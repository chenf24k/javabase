package com.chenfeng.javassist;

import javassist.*;

import java.io.IOException;

/**
 * @author 陈枫 on 2019-05-12.
 * 测试使用javassist生成一个新的类
 */
public class Demo01 {
    public static void main(String[] args) throws CannotCompileException, NotFoundException, IOException {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.makeClass("javassist.bean.Emp");

        // 创建属性
        CtField f1 = CtField.make("private int empno;", ctClass);
        CtField f2 = CtField.make("private String ename;", ctClass);
        ctClass.addField(f1);
        ctClass.addField(f2);

        // 创建方法
        CtMethod m1 = CtMethod.make("public Integer getEmpno(){return empno;}", ctClass);
        CtMethod m2 = CtMethod.make("public void setEmpno(Integer empno) { this.empno = empno; }", ctClass);
        ctClass.addMethod(m1);
        ctClass.addMethod(m2);

        //添加构造器
        CtConstructor constructor = new CtConstructor(new CtClass[]{CtClass.intType, pool.get("java.lang.String")}, ctClass);
        constructor.setBody("{this.empno = empno;this.ename = ename;}");
        ctClass.addConstructor(constructor);

        // 将上面的构造好的类写入到指定的目录下
        ctClass.writeFile("c:/test");
        System.out.println("OK!");
    }
}
