package primer.date_t;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 陈枫 on 2019-07-26.
 */
public class TestSimpleFormate {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒,本月第W周");
        Date d = new Date(121212121212L);
        String str = df.format(d);
        System.out.println(str);
        System.out.println("############");
        String str2 = "1977,7,7";
        DateFormat df2 = new SimpleDateFormat("yyyy,MM,dd");
        Date d2 = df2.parse(str2);
        System.out.println(d2);

    }
}
