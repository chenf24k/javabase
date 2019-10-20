package primer.final_t;

public class FinalTest {
    public static final int i;

    static {
        i = 10;
    }

    public void test(final int a) {
        // a = 5;编译报错
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println(FinalTest.i);
        new FinalTest().test(5);

    }
}
