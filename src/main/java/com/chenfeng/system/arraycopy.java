package com.chenfeng.system;

import java.util.Arrays;

public class arraycopy {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6, 7, 2, 4, 5};

        int[] b = null;

         b = Arrays.copyOf(a,a.length);
        Arrays.sort(a);

        for (int i : b) {
            System.out.println(i);
        }

        for (int i : a) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(a));



    }
}
