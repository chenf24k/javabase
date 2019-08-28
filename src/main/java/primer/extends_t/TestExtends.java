package primer.extends_t;

/**
 * 测试继承
 *
 * @author 陈枫 on 2019-06-29.
 */
public class TestExtends {
    public static void main(String[] args) {
        Student s = new Student("陈枫", 170, "QA");
        System.out.println(s.toString());
        s.study();
        s.study();
        System.out.println(s instanceof Student);
        System.out.println(s instanceof Person);
        System.out.println(s instanceof Object);
        System.out.println("a" instanceof Object);
        System.out.println(Integer.valueOf("1") instanceof Integer);
        System.out.println(new Person("陈枫", 170) instanceof Object);
    }
}


