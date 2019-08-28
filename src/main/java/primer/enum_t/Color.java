package primer.enum_t;

/**
 * 实现带有构造器的枚举
 * 1.通过括号赋值必须带有一个属性、带参构造、跟方法
 *
 * @author 陈枫 on 2019-07-05.
 */
public enum Color {
    RED("红色"), BLUE("蓝色"), YELLOW("黄色"), BLACK("黑色");

    String color;

    // 构造器默认是private修饰，保证构造函数只能在内部使用
    Color(String color) {
        this.color = color;
    }

    public String getValue() {
        return color;
    }
}
