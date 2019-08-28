package primer.final_t;

/**
 * @author 陈枫 on 2019-06-30.
 */
public class TestFinal {
}

/*final*/ class Animal2 {
    public /*final*/ void shout() {
        System.out.println("叫了一声!");
    }
}

class Dog extends Animal2 {
    public void shout() {
        System.out.println("旺旺!");
    }

    public void seeDoor() {
        System.out.println("看门!");
    }
}

class Cat extends Animal2 {
    public void shout() {
        System.out.println("喵...");
    }
}

