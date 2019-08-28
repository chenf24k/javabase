package primer.override_t;

import primer.extends_t.Person;
import primer.extends_t.Student;

/**
 * @author 陈枫 on 2019-06-29.
 */
public class Horse extends Vehicle {
    @Override
    public void run() {
        System.out.println("四蹄翻飞,嘚嘚嘚嘚... ");
    }

    @Override
    // 子类重写父类方法时 返回参数是类型必须≤ 父类方法的参数类型
    public Student /*Object*/ whoIsPsg() {
        // return new Person();   //编译报错
        System.out.println("正在调用子类的whoIsPsg()方法...");
        return new Student();
    }
}

