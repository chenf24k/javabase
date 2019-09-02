package sdk;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author 陈枫 on 2019-08-30.
 */
public class tttt {
    public static void main(String[] args) {
        String url = "https://www.baidu.com/img/bd_logo1.png";
        String json = "{\"headers\":{\"Server\":[\"nginx\"],\"Date\":[\"Thu, 29 Aug 2019 18:13:07 GMT\"],\"Content-Type\":[\"application\\/json\"],\"Content-Length\":[\"488\"],\"Connection\":[\"close\"]},\"body\":{\"Response\":{\"TextDetections\":[{\"DetectedText\":\"\\u6211\\u4ee5\\u4e3a\\u6211\\u591f\\u575a\\u5f3a\",\"Confidence\":99,\"Polygon\":[{\"X\":392,\"Y\":420},{\"X\":1039,\"Y\":420},{\"X\":1039,\"Y\":514},{\"X\":392,\"Y\":514}],\"AdvancedInfo\":\"{\\\"Parag\\\":{\\\"ParagNo\\\":1}}\"},{\"DetectedText\":\"\\u4e00\\u5929\\u5929\\u5931\\u671b\\u8f93\\u7684\\u90a3\\u4e48\\u7edd\\u671b\",\"Confidence\":99,\"Polygon\":[{\"X\":235,\"Y\":551},{\"X\":1261,\"Y\":551},{\"X\":1261,\"Y\":644},{\"X\":235,\"Y\":644}],\"AdvancedInfo\":\"{\\\"Parag\\\":{\\\"ParagNo\\\":2}}\"}],\"Language\":\"zh\",\"RequestId\":\"e7c73fc6-fdcd-405d-ba3f-8ac319b79c38\"}},\"url\":\"https:\\/\\/ocr.ap-guangzhou.api.tencentyun.com\",\"post_data\":{\"ImageUrl\":\"https:\\/\\/c-ssl.duitang.com\\/uploads\\/item\\/201505\\/09\\/20150509174943_QTisE.thumb.1500_0.jpeg\",\"LanguageType\":\"zh\"}}";

        JSONObject obj = JSON.parseObject(json);
        System.out.println(obj.getString(" \"TextDetections\": ["));


        //System.out.println(url.indexOf("//"));


        /*String[] arr = url.split("//");
        for (String temp : arr
        ) {
            System.out.println(temp);
        }*/

    }
}
