package com.chenfeng.testmethod;

/**
 * 测试方法的基本使用
 *
 * @author 陈枫 on 2019-06-02.
 */
public class TestMethod {
    public static void main(String[] args) {
        TestMethod tm = new TestMethod();
        tm.printSxt();
        int total = tm.add(1, 2, 3);
        System.out.println(total);
        int total2 = tm.add(5, 6);
        System.out.println(total2);
    }

    void printSxt() {
        System.out.println("北京尚学堂");
        System.out.println("上海尚学堂");
        System.out.println("广州尚学堂");
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b) {
        return a + b;
    }
}
