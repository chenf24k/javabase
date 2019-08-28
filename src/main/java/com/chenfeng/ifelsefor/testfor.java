package com.chenfeng.ifelsefor;

/**
 * @author 陈枫 on 2019-06-02.
 */
public class testfor {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        //test4();
        //test5();
        test6();
    }

    /**
     * 输出1-100之间的整数和
     */
    public static void test1() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    /**
     * 输出
     * 1    1   1   1   1
     * 2    2   2   2   2
     * 3    3   3   3   3
     * 4    4   4   4   4
     * 5    5   5   5   5
     */
    public static void test2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < i + 5; j++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 打印九九乘法表
     */
    public static void test3() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "×" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 打印九九加法表
     */
    public static void test4() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "+" + j + "=" + (i + j) + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 输出1-1000之间能被5整出的数，且每行输出5个
     */
    public static void test5() {
        int i = 1;
        int count = 0;
        for (int j = 0; j <= 1000; j++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
            i++;
        }
    }

    /**
     * 打印1-100之间的奇数与偶数和
     */
    public static void test6() {
        int jishu = 0;
        int oushu = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                oushu += i;
            } else {
                jishu += i;
            }
        }
        System.out.println("奇数和=" + jishu + "\r\n" + "偶数和=" + oushu);
    }

}
