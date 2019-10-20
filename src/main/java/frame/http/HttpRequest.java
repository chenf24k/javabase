package frame.http;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @author 陈枫 on 2019-08-26.
 */
public class HttpRequest {
    private static  HttpRequest httpRequest = new HttpRequest();
    private static CloseableHttpClient httpClient = HttpClients.createDefault();

    private static CloseableHttpResponse response;
    private static HttpGet get;
    private static HttpPost post;
    private static String responseString;


    private HttpRequest() {
    }

    public HttpRequest setUrl(String url) {
        // "https://www.baidu.com";
        get = new HttpGet(url);
        return this;
    }

    public static HttpRequest send() {
        try {
            response = httpClient.execute(get);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return httpRequest;
    }

    public static HttpRequest getResponse() {
        try {
            responseString = EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return httpRequest;
    }
}
