package primer.generics_t;

import java.util.ArrayList;

/**
 * @author 陈枫 on 2019-07-09.
 */

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {
}

class GrannySmith extends Apple{}
class Gala extends Apple {
}
class Fuji extends Apple {
}
class Braeburn extends Apple{}

public class ApplesAndOrangeWithoutGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
        //apples.add(new Orange());

        for (int i = 0; i < apples.size(); i++)
            System.out.println((apples.get(i)).id());

        for (Apple c : apples)
            System.out.println(c.id());
    }
}
