package day04.thread.demo1;

/**
 * @Author wsl
 * @Date 2021-08-13
 * 1.自定义Runnable的实现类
 * 2.重写接口中的抽象方法
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
