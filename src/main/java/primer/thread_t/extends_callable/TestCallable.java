package primer.thread_t.extends_callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author 陈枫 on 2019-08-28.
 */
public class TestCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Race rabbit = new Race("兔子", 100);
        Race dog = new Race("狗子", 50);


        ExecutorService service = Executors.newFixedThreadPool(2);
        Future future1 = service.submit(rabbit);
        Future future2 = service.submit(dog);

        Thread.sleep(2000);
        rabbit.setFlag(false);
        dog.setFlag(false);


        int setpOfRabbit = (int) future1.get();
        int setpOfDog = (int) future2.get();
        System.out.println("兔子跑了：" + setpOfRabbit);
        System.out.println("狗子跑了：" + setpOfDog);

        service.shutdown();


    }
}
