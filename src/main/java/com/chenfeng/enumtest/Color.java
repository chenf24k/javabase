package com.chenfeng.enumtest;

/**
 * @author 陈枫 on 2019-06-18.
 */

class EnumColor {
    enum Color {RED, GREEN, BLUE}

    public static void main(String[] args) {
        for (Color c : Color.values()) {
            System.out.println(c+":"+c.ordinal());
        }


        Color c = Color.BLUE;

        System.out.println(c.getDeclaringClass());
        System.out.println(c.name());



    }
}

