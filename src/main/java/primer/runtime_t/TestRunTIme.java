package primer.runtime_t;

import java.io.IOException;


/**
 * RunTime类.
 * 每个java应用有单个类Runtime实例，允许应用去和应用正在运行的环境产生交互（JVM环境）。目前的runtime对象能够从getRuntime()方法中获得。
 *
 * @author 陈枫 on 2019-07-18.
 */
public class TestRunTIme {
    public static void main(String[] args) throws IOException, InterruptedException {
        // testRunTime();
        testExec();

    }

    public static void testRunTime() {
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器的个数:" + rt.availableProcessors() + "个");
        System.out.println("空闲内存数量:" + rt.freeMemory() / 1024 / 1024 + "M");
        System.out.println("最大的内存:" + rt.maxMemory() / 1024 / 1024 + "M");
    }

    public static void testExec() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
//        Process process = rt.exec("notepad.exe");
//        Process process = rt.exec("cmd.exe /C start " + "ipconfig");
//        Process process = rt.exec("cmd.exe /C start " + "C:\\Users\\陈枫\\Desktop\\cc.bat");
        Process process = rt.exec("cmd.exe /C start " + "C:\\Users\\陈枫\\Desktop\\cc.bat");
        Thread.sleep(3000);
        process.destroy();

    }
}
