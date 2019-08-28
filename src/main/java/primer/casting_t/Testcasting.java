package primer.casting_t;

/**
 * 测试多态
 *
 * @author 陈枫 on 2019-06-30.
 */
public class Testcasting {
    public static void main(String[] args) {
        Animal d = new Dog(); //自动向上转型
        ((Dog) d).seeDoor(); //转型后才可以调用Dog类的方法

        Dog d2 = (Dog) d; // 强制向下转型
        d2.seeDoor();


        Animal c = new Cat();
        Dog d3 = (Dog) c; // 编译可以通过，运行时会报ClassCastException
        d3.seeDoor();
    }

    static void animalCry(Animal a) {
        a.shout();
    }
}

class Animal {
    public void shout() {
        System.out.println("叫了一声!");
    }
}

class Dog extends Animal {
    public void shout() {
        System.out.println("旺旺!");
    }

    public void seeDoor() {
        System.out.println("看门!");
    }
}

class Cat extends Animal {
    public void shout() {
        System.out.println("喵...");
    }
}