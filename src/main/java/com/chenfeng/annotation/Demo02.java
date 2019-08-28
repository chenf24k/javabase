package com.chenfeng.annotation;

@MyAnnotation
public class Demo02 {
    @MyAnnotation(age = 19, studentName = "陈枫", id = 1001, schools = {"陈枫"})
    public void test() {
    }

    @MyAnnotation02(value = "")
    public void test2(){

    }
}
