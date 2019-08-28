package primer.encapsulation2;

import primer.encapsulation_t.Human;

/**
 * @author 陈枫 on 2019-06-30.
 */
public class TestEncapsulation2 {
    public static void main(String[] args) {
        Human h = new Human();
        //h.name; //编译报错，default修饰，不可以被不同包的类访问
        //h.height = 170; // protected修饰，不同包仅子类可以访问
        h.sayAge();
    }
}

class Girl extends Human {
    void sayGood() {
        System.out.println(height);// protected修饰，不同包子类可以访问
    }
}

