package com.chenfeng.ifelsefor;

/**
 * @author 陈枫 on 2019-06-02.
 */
public class break_continue_return {
    public static void main(String[] args) {
        //testBreak();
        //testContinue();
        //testReturn();
        testContinue2();
    }

    public static void testBreak() {
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void testContinue() {
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                continue;
            }
        }
    }

    public static void testReturn() {
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                return;
            }
        }
    }

    /**
     * 测试待标签的continue
     */
    public static void testContinue2() {
        outer:
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < i + 5; j++) {
                if (i == 2)
                    continue outer;
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
