package primer.this_t;

/**
 * @author 陈枫 on 2019-06-29.
 */
public class TestThis {
    int a, b, c;

    TestThis(int a, int b) {
        this.a = a;
        this.b = b;
    }

    TestThis(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }

    void sing() {
    }

    void eat() {
        this.sing();//调用本类中的sing(),这里的this可不写；
        System.out.println("你妈妈喊你回家吃饭啦！");
    }

    public static void main(String[] args) {
        TestThis testThis = new TestThis(2, 3);
        testThis.eat();

        TestThis tt = new TestThis(1, 2, 3);
        tt.sing();
    }
}
