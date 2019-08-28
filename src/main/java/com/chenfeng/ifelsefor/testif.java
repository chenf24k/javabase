package com.chenfeng.ifelsefor;

/**
 * @author 陈枫 on 2019-06-02.
 */
public class testif {
    public static void main(String[] args) {
       /* double d = Math.random();// 返回0-1之间的数
        System.out.println(d);
        System.out.println((int) (6 * Math.random()));*/

        int i = (int) (6 * Math.random() + 1);
        int j = (int) (6 * Math.random() + 1);
        int k = (int) (6 * Math.random() + 1);
        int count = i + j + k;
        if (count > 15)
            System.out.println("今天手气不错哦");
        if (count >= 10 && count <= 15)
            System.out.println("今天手气很一般");
        if (count < 10)
            System.out.println("今天手气不怎么样");
        System.out.println(count);
    }
}
