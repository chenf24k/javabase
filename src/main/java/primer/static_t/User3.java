package primer.static_t;

/**
 * @author 陈枫 on 2019-06-29.
 */
public class User3 {
    int id;
    String name;
    String pwd;

    public User3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void testParamTransfer01(User3 u) {
        u.name = "小陈";
    }

    public void testParamTransfer02(User3 u) {
        u = new User3(101, "小枫");
    }

    public static void main(String[] args) {
        User3 u = new User3(100, "陈枫");
        u.testParamTransfer01(u);
        System.out.println(u.name);
        u.testParamTransfer02(u);
        System.out.println(u.name);
    }
}
