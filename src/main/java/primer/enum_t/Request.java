package primer.enum_t;

import java.io.IOException;

/**
 * @author 陈枫 on 2019-07-05.
 */
public enum Request {
    GET {
        public String send(String method) throws IOException {
            return org.apache.http.client.fluent.Request.Get(method).execute().returnContent().asString();
        }
    },
    POST {
        public String send(String method) throws IOException {
            return org.apache.http.client.fluent.Request.Get(method).execute().returnContent().asString();
        }
    };

    public abstract String send(String method) throws IOException;


    public static void main(String[] args) throws IOException {
        //
        System.out.println(Request
                .GET
                .send("https://www.baidu.com"));
    }
}
