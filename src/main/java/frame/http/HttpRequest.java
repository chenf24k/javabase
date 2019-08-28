package frame.http;

import org.apache.http.HttpEntity;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @author 陈枫 on 2019-08-26.
 */
public class HttpRequest {
    private static HttpGet GET;
    private static CloseableHttpClient httpClients;

    private static String response = null;

    static {
        httpClients = HttpClients.createDefault();
    }

    public HttpRequest() {

    }

    public static HttpGet setUrl(String url) {
        GET = new HttpGet(url);
        return GET;
    }

    public static String send() throws IOException {
        CloseableHttpResponse response2 = httpClients.execute(GET);
        HttpEntity entity = response2.getEntity();
        response = EntityUtils.toString(entity);
        return response;
    }


    public static void main(String[] args) throws IOException {


        String url = "https://test-world-api.xiaomawang.com/api/user/get-collect-compose-list?userId=584605&page=01&pageSize=12&token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOnsiZ3JhbnRUeXBlIjoiIiwic2NvcGUiOiIifSwiYXVkIjp7Im93bmVyIjp7ImFwcElkIjoieG13Mzg1MTIxMDY1NjkyMCIsInVjSWQiOjU4NDYwNSwiYWNjb3VudCI6IjE4NjU3MTcxMDAxIn0sInZpc2l0b3IiOiIueGlhb21hd2FuZy5jb20ifSwiZXhwIjoxNTY3NDE5OTMxfQ.nmkF8_Rdma4HDmaKdDDtUxFXtgPzeSsjBKi1kWAbaJM&chn=";


        System.out.println(HttpRequest.GET);




        /*CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        CloseableHttpResponse response = httpClient.execute(get);
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity);
        System.out.println(result);*/


    }
}
