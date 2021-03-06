package advanced.annotation_t;

/**
 * @author 陈枫 on 2019-09-09.
 */

@Table("tb_student")
public class Student {

    @Field(columnName = "id", type = "int", length = 10)
    private int id;
    @Field(columnName = "sname", type = "varchar", length = 10)
    private String studentName;
    @Field(columnName = "age", type = "int", length = 3)
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
