package primer.arrays;

import java.util.Arrays;

/**
 * @author 陈枫 on 2019-07-25.
 */
public class Test1 {

    public static void sort(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {123, 3242, 12, 34, 102, 3241, 1234, 90, 35, 78, 65};
        // 冒泡排序
        sort(a);
        System.out.println(Arrays.toString(a));




        /*Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a, 2));*/

        /*for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/
    }
}
