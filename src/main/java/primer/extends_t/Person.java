package primer.extends_t;

/**
 * @author 陈枫 on 2019-06-29.
 */
public class Person {
    String name;
    int heiget;

    public Person() {
        System.out.println("Person父类无参构造...");
    }

    public Person(String name, int heiget) {
        this.name = name;
        this.heiget = heiget;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", heiget=" + heiget +
                '}';
    }

    public void rest() {
        System.out.println("休息一会儿！");
    }
}
