package primer.arrays;

/**
 * 矩阵相加
 *
 * @author 陈枫 on 2019-07-25.
 */
public class Matrix {


    public static void print(int[][] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b.length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 3, 4},
                {2, 4, 7},
                {2, 4, 7}
        };
        int[][] b = {
                {3, 4, 8},
                {5, 6, 8},
                {5, 6, 8}
        };

        int[][] c = add(a, b);
        print(c);
    }
}
