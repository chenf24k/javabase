package primer.override_t;

import primer.extends_t.Person;
import primer.extends_t.Student;

/**
 * @author 陈枫 on 2019-06-29.
 */
public class Vehicle {

    public void run() {
        System.out.println("跑...");
    }

    public void stop() {
        System.out.println("停止!");
    }

    public Person whoIsPsg() {
        System.out.println("正在调用父类Person的whoIsPsg()方法...");
        return new Person();
    }
}

