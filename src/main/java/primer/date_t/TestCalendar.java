package primer.date_t;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author 陈枫 on 2019-07-26.
 */
public class TestCalendar {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        c.set(2019, Calendar.JANUARY, 30);
        Date d = c.getTime();
        System.out.println(d);

        Calendar c2 = new GregorianCalendar();
        c2.setTime(new Date());
        System.out.println(c2.get(Calendar.YEAR));
    }
}
