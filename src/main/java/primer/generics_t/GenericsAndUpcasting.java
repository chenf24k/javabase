package primer.generics_t;

import java.util.ArrayList;

/**
 * @author 陈枫 on 2019-07-09.
 */
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());

        for (Apple c : apples) {
            System.out.println(c);
        }
    }
}
