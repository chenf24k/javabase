package primer.interface_t.yeeku;

import primer.interface_t.lee.Output;

public class OutputFieldTest {
    public static void main(String[] args) {
        // 访问另一个包中的Output接口的MAX_CACHE_LINE
        System.out.println(Output.MAX_CACHE_LINE);
        // 给static final修饰的变量复制会导致编译异常
        // Output.MAX_CACHE_LINE = 20;
        // 使用接口来调用类方法
        System.out.println(Output.staticTest());
    }
}
