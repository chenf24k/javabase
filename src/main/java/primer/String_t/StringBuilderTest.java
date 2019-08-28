package primer.String_t;

import java.util.Random;

/**
 * 测试可变字符序列
 * StringBuilder 线程不安全，效率高
 * StringBuffer  线程安全，效率低
 * String         不可变字符序列
 *
 * @author 陈枫 on 2019-07-21.
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        /*StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(16);
        StringBuilder sb3 = new StringBuilder("abcd");

        sb3.append(true);
        System.out.println(sb3);
        System.out.println(sb3.reverse());

        int[] arr = new int[2];

        System.out.println(arr[2]);
        System.out.println(arr[1]);*/

        String str = "000";
        //System.out.println(str.indexOf(4));

        for (int i = 0; i < 23; i++) {
            System.out.println((int) (Math.random() * 12) + 1);
        }


    }
}
