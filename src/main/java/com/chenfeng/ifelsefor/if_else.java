package com.chenfeng.ifelsefor;

/**
 * @author 陈枫 on 2019-06-02.
 */
public class if_else {
    public static void main(String[] args) {
        /*int h = (int) (Math.random() * 6 + 1);
        if (h < 3) {
            System.out.println("小");
        } else {
            System.out.println("大");
        }*/

        double r = 4 * Math.random();
        double S = Math.PI * Math.pow(r, 2);
        double L = 2 * Math.PI * r;

        if (S > L) {
            System.out.println("面积大于周长");
        } else if (S < L) {
            System.out.println("周长大于面积");
        } else {
            System.out.println("面积等于周长");
        }

    }
}
