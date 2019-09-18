package advanced.annotation_t;

/**
 * @author 陈枫 on 2019-09-08.
 */

@ChenFengAnnotation
public class Demo {
    @ChenFengAnnotation(age = 19, studentName = "陈枫", id = 0, schools = {"马剑大学"})
    public static void main(String[] args) {

    }

    @CustomAnnotation("aaa")
    public void test2() {

    }
}
