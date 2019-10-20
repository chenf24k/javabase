package primer;

import frame.http.HttpRequest;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class zizeng {


    public static void main(String[] args) throws IOException {

        /*zizeng z = new zizeng();
        z.setUrl("https://www.baidu.com");
        String str = z.getResponse();
        System.out.println(str);*/




       /* int num1 = 10;
        int result = num1++;
        System.out.println(result);*/
//        System.out.println(++result);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 8; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    static CloseableHttpClient httpClients;
    CloseableHttpResponse response;
    HttpGet get;

    void setUrl(String url) {
        get = new HttpGet(url);
    }

    static {
        httpClients = HttpClients.createDefault();
    }

    void send() {
        try {
            response = httpClients.execute(get);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String getResponse() throws IOException {
        send();
        HttpEntity entity = response.getEntity();
        return EntityUtils.toString(entity);
    }

}
