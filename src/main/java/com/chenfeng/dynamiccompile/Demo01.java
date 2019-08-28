package com.chenfeng.dynamiccompile;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author 陈枫 on 2019-05-11.
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null, "C:\\Users\\陈枫\\IdeaProjects\\basepractice\\src\\hello\\HelloWorld.java");
        System.out.println(result == 0 ? "OK" : "FAIL");

        // 通过IO流操作，将字符串存储成一个临时文件
        String str = "public class HelloWorld {public static void main(String[] args){System.out.println(\"Hello,World!\");}";


        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("java -cp C:/  HelloWorld");
        InputStream in = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String info;
        while ((info = reader.readLine()) != null) {
            System.out.println(info);
        }


    }
}
