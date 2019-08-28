package primer.encapsulation_t;

/**
 * @author 陈枫 on 2019-06-30.
 */
public class Human {
    private int age;
    String name; //默认default修饰，可以被本包下的类所访问
    protected int height;

    public void sayAge() {
        System.out.println(age);
    }
}
