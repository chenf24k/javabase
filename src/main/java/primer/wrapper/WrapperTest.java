package primer.wrapper;

public class WrapperTest {
    public static final int i;

    static {
        i = 10;
    }

    public void test(){

    }

    public static void main(String[] args) {
        System.out.println(WrapperTest.i);

    }
}
