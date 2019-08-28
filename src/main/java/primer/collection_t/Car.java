package primer.collection_t;

/**
 * @author 陈枫 on 2019-08-04.
 */
public class Car {
    Car c;
    Object o;
    Car c2;

    public Car getC() {
        return c;
    }

    public void setC(Car c) {
        this.c = c;
    }

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public Car getC2() {
        return c2;
    }

    public void setC2(Car c2) {
        this.c2 = c2;
    }

    public static void main(String[] args) {
        String a = "aa";
        String b = a;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


    }
}
