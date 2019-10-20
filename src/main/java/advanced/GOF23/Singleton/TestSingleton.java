package advanced.GOF23.Singleton;

import org.testng.annotations.Test;

/**
 * @author 陈枫 on 2019-09-19.
 */
@Test
public class TestSingleton {
    public void testSingleton() {
        SingletonDemo1 a = SingletonDemo1.getInstance();
        SingletonDemo1 a2 = SingletonDemo1.getInstance();
        System.out.println(a == a2);
        System.out.println(a.hashCode());
        System.out.println(a2.hashCode());

        SingletonDemo2 s = SingletonDemo2.getInstance();
    }
}
