package com.chenfeng.testmethod;

/**
 * 测试方法的基本使用
 *
 * @author 陈枫 on 2019-06-02.
 */
public class TestMethod2 {
    public static void main(String[] args) {
        a();
        long start = System.currentTimeMillis();
        System.out.println(factorial(10));
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

    static int count = 0;

    static void a() {
        System.out.println("a:" + count);
        count++;
        if (count < 10)
            a();
        else
            return;
    }

    static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
