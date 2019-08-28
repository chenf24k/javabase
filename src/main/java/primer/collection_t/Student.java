package primer.collection_t;

import java.util.Objects;

/**
 * @author 陈枫 on 2019-08-13.
 */
public class Student {
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Integer i = new Integer(0);
        System.out.println();;
    }
}
