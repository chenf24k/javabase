package primer.nestedclass_t;

/**
 * @author 陈枫 on 2019-09-05.
 */
public class Outer {
    private int value = 10;

    public void add(final int x, int y) {
        final int z = 100;

        class Inner {
            void display() {
                int sum = x + z + value;
                System.out.println("sum=" + sum);
            }
        }

        new Inner().display();
    }

}

class HelloWorld {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.add(100, 300);
    }
}
