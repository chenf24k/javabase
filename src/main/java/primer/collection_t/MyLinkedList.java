package primer.collection_t;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 陈枫 on 2019-07-27.
 */
public class MyLinkedList {
    private Node first;
    private Node last;
    private int size;

    public void add(Object obj) {
        Node n = new Node();
        if (first == null) {
            n.setPrevious(null);
            n.setObj(obj);
            n.setNext(null);
            first = n;
            last = n;
        } else {
            n.setPrevious(last);
            n.setObj(obj);
            n.setNext(null);
            last.setNext(n);
            last = n;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        Node temp = first;
        if (first != null) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }
        return temp;
    }

    public static void main(String[] args) {

        List list1 = new LinkedList();
        MyLinkedList list = new MyLinkedList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list.size());
        Node n = (Node) list.get(1);
        System.out.println(n.obj);
    }
}
