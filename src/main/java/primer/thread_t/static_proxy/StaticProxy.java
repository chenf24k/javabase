package primer.thread_t.static_proxy;

/**
 * 静态代理 设计模式
 * 1.真实角色
 * 2.代理角色：持有真实角色的引用
 * 3.二者实现相同的接口
 *
 * @author 陈枫 on 2019-08-28.
 */
public class StaticProxy {
    public static void main(String[] args) {
        // 创建真实角色
        // You you  = new You();
        // 创建代理角色
        WeddingCompany wc = new WeddingCompany(new You());
        wc.marry();

        Marry marry = new WeddingCompany(new You());
        marry.marry();
    }


}

// 接口
interface Marry {
    public abstract void marry();
}

// 真实角色
class You implements Marry {
    @Override
    public void marry() {
        System.out.println("you and 嫦娥结婚了...");
    }
}

// 代理角色
class WeddingCompany implements Marry {
    private You you;

    public WeddingCompany() {
    }

    public WeddingCompany(You you) {
        this.you = you;
    }

    private void before() {
        System.out.println("布置猪窝....");
    }

    private void after() {
        System.out.println("闹玉兔....");
    }

    @Override
    public void marry() {
        before();
        you.marry();
        after();
    }
}
