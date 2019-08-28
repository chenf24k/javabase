package primer.static_t;

/**
 * @author 陈枫 on 2019-06-29.
 */
public class User2 {
    int d;
    String name;
    String pwd;
    static String company;

    //执行类的初始化工作，在构造器之前执行
    static {
        System.out.println("执行类的初始化工作");
        company = "陈枫很牛逼";
        printCompany();
    }

    public static void printCompany() {
        System.out.println(company);
    }

    public static void main(String[] args) {
        User2 u = null;
    }
}
