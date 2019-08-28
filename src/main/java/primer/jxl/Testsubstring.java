package primer.jxl;

/**
 * @author 陈枫 on 2019-08-04.
 */
public class Testsubstring {
    public static void main(String[] args) {
        String aa = "1,2,3,4,6,7,";
        System.out.println(aa.length());

        int index = aa.lastIndexOf(",");
        String bb = aa.substring(0, aa.length() - 1);
        System.out.println(bb);
    }
}
