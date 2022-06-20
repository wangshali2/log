package day04.thread.demo3;


/**
 * @author wsl
 * @version 2020-09-19
 * 线程安全问题的解决方案
 * 1.同步代码块
 * 2.同步方法
 * 3.锁Locked
 * <p>
 * <p>
 * 同步 ：synchronized
 * 线程安全问题的解决方案1
 * 同步代码块：synchronized（锁）{可能存在线程安全的代码}
 * 在同步代码块中的代码同时只能被一条线程执行
 * 锁：同步代码块所在的方法是实例方法还是静态方法
 * 静态方法：当前类.class
 * 实例方法：当前类的对象：this
 * 其他类的对象：对象名字
 * <p>
 * 注意:多个线程必须是一把锁；任何一个类的对象，都可以当锁
 * <p>
 * 格式：synchronized (锁){
 * 可能存在线程安全的代码
 * }
 */
public class Test03 {
    public static void main(String[] args) {

        Ticket t = new Ticket();

        Thread t1 = new Thread(t, "窗口1");
        Thread t2 = new Thread(t, "窗口2");
        Thread t3 = new Thread(t, "窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
