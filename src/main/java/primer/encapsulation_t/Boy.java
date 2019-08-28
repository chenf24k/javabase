package primer.encapsulation_t;

/**
 * @author 陈枫 on 2019-06-30.
 */

class Boy extends Human {

    void sayHello() {
        //  System.out.println(age);   //子类无法调用父类的私有属性和方法
    }
}