package primer.staticinitializer;

public class InstanceInitTest {
    {
        a = 6;
    }

    int a = 9;

    public InstanceInitTest() {
        this.a = 8;
    }

    void print(int i) {
        System.out.println(a + i);
    }

    public static void main(String[] args) {
        System.out.println(new InstanceInitTest().a);
       /* InstanceInitTest initTest = new InstanceInitTest();
        initTest.print(7);*/
    }
}
