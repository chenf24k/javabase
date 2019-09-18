package primer.thread_t.extends_callable;

import java.util.concurrent.Callable;

/**
 * 1.创建Callable实现+重写call方法
 * 2.借助 执行调度服务 ExcutorService，获取Future对象
 * <p>
 * ExecutorService ser = Executors.newFixedThreadPool(2);
 * Future result = ser.submit(实现类对象)
 * result.get()
 * 停止服务ser.shutdownNow()
 *
 * @author 陈枫 on 2019-09-05.
 */
public class Race implements Callable<Integer> {
    private String name;
    private long time;
    private boolean flag = true;
    private int step = 0;

    public Race(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public Integer call() throws Exception {
        while (flag) {
            Thread.sleep(time);
            step++;
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
