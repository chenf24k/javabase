package primer.collection_t;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 自己实现一个ArrayList
 *
 * @author 陈枫 on 2019-07-27.
 */
public class MyArrayList {
    private Object[] elementData;
    private int size;

    public MyArrayList() {
        this(10);
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public MyArrayList(int initialCapacity) {
        super();
        if (initialCapacity < 0) {
            throw new IndexOutOfBoundsException("数组越界");
        }
        this.elementData = new Object[initialCapacity];
    }

    public void add(Object obj) {
        ensureCapacity();
        elementData[size++] = obj;
    }

    public Object get(int index) {
        rangeCheck(index);
        return elementData[index];
    }

    public void remove(int index) {
        rangeCheck(index);
        // 删除指定位置的对象
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
            elementData[--size] = null;
        }
    }

    public void remove(Object obj) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(obj)) {
                remove(i);
            }
        }
    }

    public void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void ensureCapacity() {
        if (size == elementData.length) {
            Object[] newArray = new Object[(size * 2 + 1)];
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            elementData = newArray;
        }
    }

    public void set(int index, Object object) {
        rangeCheck(index);
        elementData[index] = object;
    }

    public void add(int index, Object obj) {
        rangeCheck(index);
        ensureCapacity();
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = obj;
        size++;
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("333");
        list.add("444");
        list.add("555");
        list.add("666");
        System.out.println(list.size());
        System.out.println(list.get(4));
    }
}
