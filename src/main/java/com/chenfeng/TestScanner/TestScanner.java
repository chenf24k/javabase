package com.chenfeng.TestScanner;

import java.util.Scanner;

/**
 * 测试获得键盘输入
 *
 * @author 陈枫 on 2019-06-02.
 */
public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = scanner.nextLine();
        System.out.println("请输入你的爱好：");
        String favo = scanner.nextLine();
        System.out.println("请输入你的年龄：");
        int age = scanner.nextInt();

        System.out.println(name + ":" + favo + ":" + age);
        System.out.println(22 * 365);
        scanner.close();
    }
}
