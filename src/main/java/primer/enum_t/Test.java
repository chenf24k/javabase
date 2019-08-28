package primer.enum_t;

import org.apache.http.client.fluent.Request;

import java.io.IOException;

/**
 * @author 陈枫 on 2019-07-05.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Color c = Color.BLUE;
        System.out.println(c);
        for (Color color : Color.values()) {
            System.out.println(color.getValue());
        }


        String response = Request.Get("https://www.baidu.com").execute().returnContent().asString();
        System.out.println(response);


    }
}
