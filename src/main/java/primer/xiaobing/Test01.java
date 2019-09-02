package primer.xiaobing;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 陈枫 on 2019-08-29.
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            while (true) {
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String str = df.format(new Date());
                System.out.print(str);
                Thread.sleep(1000);
                for (int j = 0; j < str.length(); j++) {
                    System.out.print('\b');
                }
            }
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }

    }
}
