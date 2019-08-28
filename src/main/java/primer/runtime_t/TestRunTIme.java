package primer.runtime_t;

import org.omg.SendingContext.RunTime;

import java.io.IOException;

/**
 * RunTime类
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
        System.out.println("空闲内存数量:" + rt.freeMemory() / 1024 / 1014 + "M");
        System.out.println("最大的内存:" + rt.maxMemory() / 1024 / 1014 + "M");
    }

    public static void testExec() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process process = rt.exec("notepad.exe");
        Thread.sleep(3000);
        process.destroy();

    }
}
