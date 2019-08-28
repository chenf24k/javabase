package primer.object_t;

/**
 * @author 陈枫 on 2019-06-30.
 */
public class Person2 {
    String name;
    int age;

    public Person2() {
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class Student2 {
    static {
        System.out.println("执行Person内部类的静态初始化块...");
    }
}
