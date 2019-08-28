package primer.object_t;

/**
 * @author 陈枫 on 2019-06-30.
 */
public class TestEquals {
    public static void main(String[] args) {
        Object obj;
        String str;

        User u1 = new User(1000, "陈枫", "123456");
        User u2 = new User(1000, "陈小枫", "123456");
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        String str1 = "123456";
        String str2 = "123456";

        String str3 = new String("123456");
        String str4 = new String("123456");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3.equals(str4));
        char[] c1 = str1.toCharArray();
        for (char c : c1) {
            System.out.println(c);
        }


    }
}

