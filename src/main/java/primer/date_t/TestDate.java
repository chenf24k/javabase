package primer.date_t;

import java.util.Date;

/**
 * 测试时间类
 *
 * @author 陈枫 on 2019-07-26.
 */
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());

        Date d2 = new Date(100000);
        System.out.println(d2.toGMTString());

        Date d3 = new Date(1991, 12, 20);

        System.out.println(d3);

    }
}
