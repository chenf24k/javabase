package primer.arrays;

/**
 * @author 陈枫 on 2019-06-30.
 */
public class Test03 {
    public static void main(String[] args) {
        int[] a = new int[4];

        for (int i = 0; i < a.length; i++) {
            a[i] = 100 * i;
        }

        for (int i = 0; i < a.length; i++) {
            // System.out.println(a[i]);
        }

        //foreach 仅可用于读取数组中元素的值，不能修改元素的值
        for (int m : a) {
            System.out.println(m);
        }
    }
}
