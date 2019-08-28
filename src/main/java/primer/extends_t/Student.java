package primer.extends_t;

/**
 * @author 陈枫 on 2019-06-29.
 */
public class Student extends Person {
    String major;

    public Student() {
        super();
        System.out.println("Student子类无参构造...");
    }

    public Student(String name, int heiget, String major) {
        super(name, heiget);
        this.major = major;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", heiget=" + heiget +
                ", major='" + major + '\'' +
                '}';
    }

    public void study() {
        System.out.println("学习两小时！");
    }
}
