package com.chenfeng.Call;

import java.util.concurrent.*;

/**
 * @author 陈枫 on 2019-05-14.
 */
public class Call {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建线程
        ExecutorService service = Executors.newFixedThreadPool(1);
        Race tortoise = new Race("老不死", 1000);
        Race rabbit = new Race("小兔子", 500);

        // 获取值
        Future<Integer> result1 = service.submit(tortoise);
        Future<Integer> result2 = service.submit(rabbit);

        Thread.sleep(2000);

        tortoise.setFlag(false);//停止线程体循环
        rabbit.setFlag(false);

        int num1 = result1.get();
        int num2 = result2.get();

        System.out.println("乌龟跑了" + num1 + "步");
        System.out.println("兔子跑了" + num2 + "步");


        // 停止服务
        service.shutdownNow();
    }
}

class Race implements Callable<Integer> {
    private String name;
    private long time;
    private boolean flag = true;
    private int step = 0;

    public void setTime(long time) {
        this.time = time;
    }

    public Race() {
    }

    public Race(String name, long time) {
        this.name = name;
        this.time = time;
    }

    public Race(String name) {
        super();
        this.name = name;

    }

    @Override
    public Integer call() throws Exception {
        while (flag) {
            Thread.sleep(time);// 延时
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
