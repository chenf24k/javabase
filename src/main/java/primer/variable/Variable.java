package primer.variable;

import java.util.List;

/**
 * @author 陈枫 on 2019-06-25.
 * 1.局部变量使用时必需进行初始化赋值（local variable）
 * 2.成员变量从属于对象，未赋值时会自动初始化为该类型的默认初始值(member variable)
 * 3.从属于类，生命周期伴随类的始终(static variable)
 */
public class Variable {
    String name;//成员变量
    char a;
    List list;
    static int size;

    public static void main(String[] args) {

        int age = 0;
        int salalry = 3000;

        Variable var = new Variable();
        System.out.println(var.name);
        System.out.println(var.a);
        System.out.println(var.list);
        System.out.println(size);

      /*  String name = null;
        System.out.println(name);*/
    }
}
