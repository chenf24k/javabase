package primer.static_t;

/**
 * @author 陈枫 on 2019-06-28.
 */
public class User {
    int id;
    String name;
    String pwd;

    static String company = "杭州分公司";

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void login() {
        System.out.println(company);
        System.out.println("登录" + name);
        printCompany();
    }


    public static void printCompany() {
        System.out.println(company);
    }

    public static void main(String[] args) {
        User u1 = new User(101, "陈枫");
        u1.login();
        User u2 = new User();
        System.out.println(u2.name);


    }
}
