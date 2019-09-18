package primer.main;


/**
 * @author 陈枫 on 2019-09-05.
 */
public class TestMain {

    public static void main(String[] args) {
        System.out.println("main方法运行中...");

        /*for (int i = 0; i < args.length; i++) {
            if (args[i].equals("" + i)) {
                System.out.println("参数是" + i);
            }
        }*/

        if (args[0].equals("1")) {
            System.out.println("参数是" + 1);
        }

        if (args[0].equals("2")) {
            System.out.println("参数是" + 2);
        }
    }
}

