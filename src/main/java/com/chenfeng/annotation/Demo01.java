package com.chenfeng.annotation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@SuppressWarnings("all")
public class Demo01 {

    @Override
    public String toString() {
        return "";
    }

    @Deprecated
    public static void test01() {
        System.out.println(System.currentTimeMillis());
    }

    @SuppressWarnings("all")
    public static void test02() {
        List list = new ArrayList();

    }

    @SuppressWarnings(value = {"all", ""})
    public static void test03() {
        List list = new ArrayList();

    }


    public static void main(String[] args) {
        Date date = new Date();
        // date.parse("");
        test01();
    }

}
