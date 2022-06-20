package day04.thread.demo1;

/**
 * @Author wsl
 * @Date 2021-08-13
 * Thread
 * 位置：java.lang.Thread
 * 解释：程序中的执行线程
 * 构造器：
 * public Thread()分配新的 Thread 对象
 * public Thread(String name)分配新的 Thread 对象，name-新线程的名称。
 * public Thread(Runnable target)分配新的 Thread 对象
 * *
 * 方法：
 * public void run()让新线程执行的方法，在线程中必须要重写run方法
 * public void start()使该线程开始执行；Java 虚拟机调用该线程的 run 方法。结果是两个线程并发地运行；当前线程（从调用返回给 start 方法）和另一个线程（执行其 run 方法）。
 * 多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
 * public static void sleep(long millis)在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）
 * public final String getName()返回该线程的名称。
 * public static Thread currentThread()返回对当前正在执行的线程对象的引用。
 * <p>
 * 开启线程的方式：
 * 1.继承Thread类
 * 2.实现Runnable接口：不可以带泛型
 * 3.线程池
 * 4.实现callable接口：可以带泛型（和2唯一的区别）
 * <p>
 *
 * <p>
 * <p>
 * 弊端：单继承，且子类不需要重写方法也不会报错
 */
public class Test01 {
    public static void main(String[] args) {

        Thread.currentThread().setName("主线程");

        Thread th = new Thread("线程1");
        for (int i = 0; i < 10; i++) {
            if (i <= 5) {
                try {
                    th.join();
                    System.out.println(th.getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(Thread.currentThread().getName());
            }
        }

        MyThread th1 = new MyThread("自定义线程1");
        MyThread th2 = new MyThread("自定义线程2");
        //两个线程争夺资源，cpu高速随机切换，两者处理的不是一个数据，不存在安全问题
        th1.start();
        th2.start();

        MyRunnable run = new MyRunnable();
        Thread th3 = new Thread(run, "run线程3");
        Thread th4 = new Thread(run, "run线程4");
        th3.start();
        th4.start();

        //创建匿名内部类
        Runnable run2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

    }
}
