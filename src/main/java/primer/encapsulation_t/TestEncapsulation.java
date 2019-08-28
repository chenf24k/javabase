package primer.encapsulation_t;

/**
 * @author 陈枫 on 2019-06-30.
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        Human h = new Human();
        // h.age;   // 编译报错。
        h.name = "陈枫";
        h.height = 170;// protected修饰，同包可以访问

        Person4 p4 = new Person4();
        p4.setAge(13);

    }
}

