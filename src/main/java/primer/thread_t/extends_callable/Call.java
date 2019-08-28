package primer.thread_t.extends_callable;

import java.util.concurrent.*;

/**
 * 使用Callable创建线程
 *
 * @author 陈枫 on 2019-08-28.
 */
public class Call {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建线程
        ExecutorService service = Executors.newFixedThreadPool(1);
        Future<Integer> future = service.submit(new Race());
        int num = future.get();
        System.out.println(num);
        service.shutdown();
    }
}

class Race implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return 1000;
    }
}
