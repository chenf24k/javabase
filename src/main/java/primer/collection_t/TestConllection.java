package primer.collection_t;

import java.util.*;

/**
 * Collection
 * Set  无序，不可重复
 * -- HashSet
 * List 有序，可重复
 * -- LinkedList    底层实现是链表，查询慢，增删改较快
 * -- ArrayList     底层实现是数组，查询快，增删改较慢
 * -- Vector        线程安全，效率低，前两者线程不安全，效率高
 * Map  键值对
 * --  HasMap
 *
 * @author 陈枫 on 2019-07-27.
 */

public class TestConllection {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("aaa");
        list.add(new Date());
        list.add(new Dog());
        list.add(1234);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        // list.remove("aaa");
        System.out.println(list.size());
        String str = (String) list.get(0);
        System.out.println(str);


        List list2 = new ArrayList();
        list2.add("bbb");
        list2.add("ccc");

        List list3 = new ArrayList();

        list2.add(list);
        System.out.println(list2.size());
        list3.addAll(list);
        System.out.println(list3.size());

        Vector v ;
    }
}

class Dog {

}
