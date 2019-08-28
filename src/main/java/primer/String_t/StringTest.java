package primer.String_t;


/**
 * 练习字符串String常用方法
 *
 * @author 陈枫 on 2019-07-11.
 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("abcd");
        String str2 = new String("abcd");
        String str3 = "abcd";
        String str4 = "abcd";

        System.out.println(str1.equals(str2));// true
        System.out.println(str1 == str2);// false
        System.out.println(str3 == str4); //直接指向常量池，返回true

        // o与str 引用地址相同，输出的结果为true
        Object o = new Object();
        o = str1;
        System.out.println(o instanceof String);// 返回true
        System.out.println(str1.equals(o));//返回true

        // 根据索引返回字符
        System.out.println(str1.charAt(3));

        // 根据字符返回索引
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.indexOf('r'));

        System.out.println(String.CASE_INSENSITIVE_ORDER.compare("1", "1"));

        // String支持传入字符数组
        char[] c = new char[]{'c', 'h', 'e', 'n'};
        String name = new String(c, 0, 2);
        System.out.println(name);
        char[] c2 = name.toCharArray();
        System.out.println(c2);

        String str5 = "aaa,bbb,ccc,ddd";
        String[] strArray = str5.split(",");
        for (String s : strArray
        ) {
            System.out.println(s);
        }

       /* int n = 10;
        while (n-- != 0) {
            System.out.println(n);
        }*/

        int i = 0;
        System.out.println(i++);// 先运算，后赋值
        System.out.println(++i);// 先赋值，后运算

        String str6 = "   a   c    c    ";
        System.out.println(t1(str6));


        System.out.println("Abc".equalsIgnoreCase("abc"));
        System.out.println("Abc".toLowerCase());

        System.out.println("Abcedf".lastIndexOf('c'));


    }

    // 尝试写一个方式，去除首尾和中间空格
    public static String t1(String originString) {
        String another = null;
        if (originString.trim().contains(" ")) {
            another = originString.trim().replace(" ", "");
        }
        return another;
    }
}
