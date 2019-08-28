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
        // 获取值
        Race race = new Race("", 500);

        Future<Integer> future = service.submit(race);
        Thread.sleep(1000);
        race.setFlag(false);

        int num = future.get();
        System.out.println(num);
        // 结束线程
        service.shutdown();
    }
}

class Race implements Callable<Integer> {
    private String name;
    private long time;
    private boolean flag = true;
    private int step = 0;

    private Race() {
    }

    public Race(String name) {
        this.name = name;
    }

    public Race(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public Integer call() throws Exception {
        while (flag) {
            Thread.sleep(time);
            System.out.println(this.name + "-->" + step++);
        }
        return step;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
}
