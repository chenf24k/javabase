package primer.arrays;

/**
 * 测试多维数组
 *
 * @author 陈枫 on 2019-07-24.
 */
public class TestManyDimensions {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1},
                {2, 2},
                {3, 3}
        };

        System.out.println(a[0][1]);

        int[][] b = new int[3][];
        b[0] = new int[2];
        b[1] = new int[4];
        b[2] = new int[3];

        b[0][0] = 1;

        int[][] c = new int[3][3];

        c[0][0] = 1;
        System.out.println(c[0][0]);
    }
}
