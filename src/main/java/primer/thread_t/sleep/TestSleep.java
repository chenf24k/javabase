package primer.thread_t.sleep;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 陈枫 on 2019-09-07.
 */
public class TestSleep {
    public static void main(String[] args) throws InterruptedException {
       /* int num = 10;
        while (true) {
            System.out.println(num--);
            Thread.sleep(1000);
            if (num == 0)
                break;
        }*/


        Date endTime = new Date(System.currentTimeMillis() + 10 * 1000);
        long end = endTime.getTime();
        while (true) {
            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
            Thread.sleep(1000);
            endTime = new Date(endTime.getTime() - 1000);
            if (end - 10000 > endTime.getTime()) {
                break;
            }
        }

    }
}
