package primer.String_t;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.ArrayList;

/**
 * 模拟JDK中ArrayList
 *
 * @author 陈枫 on 2019-07-23.
 */
public class MyCollection {
    private Object[] value;
    private int size;

    public MyCollection() {
        this(16);
    }

    public MyCollection(int size) {
        value = new Object[size];
    }

    public void add(Object obj) {
        value[size] = obj;
        size++;
        if (size >= value.length) {
            int newCapacity = value.length * 2;
            Object[] newList = new Object[newCapacity];
            System.arraycopy(value, 0, newList, 0, value.length);
            /*for (int i = 0; i < value.length; i++) {
                newList[i] = value[i];
            }*/
            value = newList;
        }

    }

    public Object get(int index) {
        if (index < 0 || index > size - 1)
            throw new IndexOutOfBoundsException();
        return value[index];
    }

    public int indexOf(Object obj) {
        if (obj == null)
            return -1;
        else
            for (int i = 0; i < value.length; i++) {
                if (obj == value[i])
                    return i;
            }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null)
            return -1;
        else
            for (int i = value.length - 1; i >= 0; i++) {
                if (obj == value[i])
                    return i;
            }
        return -1;
    }

    public static void main(String[] args) {
        MyCollection mc = new MyCollection();

        mc.add("1");
        for (int i = 0; i < 21; i++) {
            mc.add(new Human("陈枫"));
        }

        System.out.println(mc.size);

        Human hu = (Human) mc.get(-1);
        System.out.println(hu.getName());


        /*System.out.println(mc.get(100));
        for (int i = 0; i < 10; i++) {
            System.out.println(mc.get(i));
        }*/


    }
}
