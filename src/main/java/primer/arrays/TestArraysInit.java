package primer.arrays;


import primer.object_t.User;

/**
 * @author 陈枫 on 2019-06-30.
 */
public class TestArraysInit {
    public static void main(String[] args) {
        // 静态初始化
        int[] a = {2, 3, 4, 5, 6};

        User[] b = {
                new User(1001, "陈枫1", "123456"),
                new User(1002, "陈枫2", "123456"),
                new User(1003, "陈枫3", "123456"),
        };

        // 默认初始化
        int[] c = new int[3]; //默认赋值，同成员变量一致

        // 动态初始化
        int[] d = new int[2];
        d[0] = 1;
        d[1] = 2;
    }
}
