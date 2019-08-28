package primer.collection_t;

/**
 * 实现Map,简单实现
 * 1.提升查询效率
 *
 * @author 陈枫 on 2019-07-28.
 */
public class MyMap {
    Entry[] arr = new Entry[990];
    int size;

    public void put(Object key, Object value) {
        Entry e = new Entry(key, value);
        int a = key.hashCode() % 999;
        arr[a] = e;
        size++;
    }

    public Object get(Object key) {
        return arr[key.hashCode() % 999];
    }

    public boolean containsKey(Object key) {
        for (int i = 0; i < size; i++) {
            if (arr[i].key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        MyMap m = new MyMap();
        m.put("陈枫", new Wife("郭贤"));
        Wife w = (Wife) m.get("陈枫");
        System.out.println(w.getName());
    }
}

class Entry {
    Object key;
    Object value;

    public Entry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
}

class Wife {
    private String name;

    public Wife(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
