package primer.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈枫 on 2019-06-25.
 */
public class TestArrays {
    public static void main(String[] args) {
        int[] arr01 = new int[10];
        String arr02[] = new String[10];

        arr01[0] = 13;
        arr01[1] = 14;
        arr01[2] = 15;
        for (int i : arr01) {
            System.out.println(i);
        }

        try {
            throw new RuntimeException("甩锅");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // System.out.println(arr01[10]);

        List list = new ArrayList();
        list.add(1);
        list.add("a");

        System.out.println(list.toString());
        for (Object o : list) {
            System.out.println(o.toString());
        }


        User[] arr03 = new User[3];
        arr03[0] = new User(1001, "陈枫1");
        arr03[1] = new User(1002, "陈枫2");
        arr03[2] = new User(1003, "陈枫2");


    }

    static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
