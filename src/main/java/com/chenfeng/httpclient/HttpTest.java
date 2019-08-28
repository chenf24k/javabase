package com.chenfeng.httpclient;


import org.apache.http.client.fluent.Request;

import java.io.IOException;

/**
 * @author 陈枫 on 2019-05-25.
 */
public class HttpTest {
    public static void main(String[] args) throws IOException {
        String response = Request.Get("https://www.baidu.com").execute().returnContent().asString();
        System.out.println(response);

    }
}
