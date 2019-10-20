package ALG;

/**
 * @author ：chenfeng
 * @date ：Created in 2019-10-09 21:17
 * @description：
 */
public class SortABC<T> {
    static int b;
    static int c;
    int d;

    public static void print(int... a) {

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void print() {

    }

    public static void main(String[] args) {
        print();
        print(1);
        print(1, 2, 4);
    }
}
