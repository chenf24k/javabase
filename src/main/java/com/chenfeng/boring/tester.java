package com.chenfeng.boring;

/**
 * @author 陈枫 on 2019-05-25.
 */
public class tester {

    public static void cal(int x, int y, int z) {
        if (x > 0 && y > 0) {
            z = z / x;
            System.out.println(z);
        }
        if (x > 1 || z > 1) {
            z = z + 1;
            System.out.println(z);
        }
        z = y + z;
        System.out.println(z);
    }

    public static void main(String[] args) {
//        cal(2,1,6);
        cal(1,0,1);

    }
}
