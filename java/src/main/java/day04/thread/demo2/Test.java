package day04.thread.demo2;

/**
 * @author wsl
 * @version 2020-09-19
 * 线程间单通信 -单生产者多消费者
 * Object类的方法
 * public final void notify()唤醒在此对象监视器上等待的单个线程
 * public final void notifyAll()唤醒在此对象监视器上等待的所有线程
 * public final void wait()当前线程等待
 * wait方法与notify方法必须要由同一个锁对象（包子）调用
 * <p>
 * 线程安全问题：多条线程操作同一数据资源：在某个线程操作未完成的过程中，其他线程参与进来也操作车票。
 * 1.同一张票被卖了多次--在ticket--之前，几个线程都有可能执行这行
 * 2.卖票的顺序乱序--cpu抢占资源有关
 * 3.卖了不存在的票---极端情况还剩1张票时被阻塞-1,0
 * 解决：当一个线程在操作数据时即使被阻塞，其他线程不能参与进来，直到其操作完数据。
 * 1.同步代码块
 * 2.同步方法
 * 3.锁Locked
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        BaoZi b = new BaoZi();


        DianPu bzp = new DianPu("", b);

        ChiHuo c = new ChiHuo("", b);

        bzp.start();
        c.start();

    }
}
