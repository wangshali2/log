package thread.demo1;

/**
 * @Author wsl
 * @Date 2021-08-13
 * 1.继承Thread类
 * 1.创建自定义线程类，继承Thread类
 * 2.重写Thread父类的run()
 * 3.测试类中需要几条线程就创建几个自定义线程类的对象
 * 4.调用自定义线程start()
 */
public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---进入---");   //Thread.currentThread().getName().equals("1")
        try {
            sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(Thread.currentThread().getName()+"---离开---");
        }
    }
}
