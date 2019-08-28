package com.chenfeng.teststatic;

/**
 * @author 陈枫 on 2019-06-02.
 */
public class User {
    int id;
    String name;
    String pwd;
    static String company;

    static {
        System.out.println("执行类的初始化工作");
        company = "北京尚学堂";
        printCompany();
    }

    public static void printCompany() {
        System.out.println(company);
    }

    public static void main(String[] args) {
        User user = null;
    }
}
