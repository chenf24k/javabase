package primer.thread_t.extends_callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author 陈枫 on 2019-09-06.
 */
public class Call {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Race rabbit = new Race("兔子", 500);
        Race tortoise = new Race("乌龟", 500);
        Future<Integer> result1 = service.submit(rabbit);
        Future<Integer> result2 = service.submit(tortoise);

        Thread.sleep(2000);
        rabbit.setFlag(false);
        tortoise.setFlag(false);
        int num1 = result1.get();
        int num2 = result2.get();
        System.out.println("兔子-->" + num1);
        System.out.println("乌龟-->" + num2);
        service.shutdownNow();
    }
}


