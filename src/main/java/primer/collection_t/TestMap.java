package primer.collection_t;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 陈枫 on 2019-07-27.
 */
public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("陈枫", "郭贤");
        map.put("邓超", "张俪");
        map.put(1, 1);

        System.out.println(map.get(1));
        System.out.println("陈枫");
        Set set = map.keySet();
    }
}
