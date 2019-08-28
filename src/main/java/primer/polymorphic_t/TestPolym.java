package primer.polymorphic_t;

/**
 * 测试多态
 *
 * @author 陈枫 on 2019-06-30.
 */
public class TestPolym {
    public static void main(String[] args) {
        Animal a = new Animal();
        animalCry(a);
        Dog d = new Dog();
        animalCry(d);
        
        animalCry(new Cat());
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
}

class Cat extends Animal {
    public void shout() {
        System.out.println("喵...");
    }
}