package thread.demo2;

/**
 * @author wsl
 * @version 2020-09-19
 */
public class ChiHuo extends Thread {
    private BaoZi ba;

    public ChiHuo(String name, BaoZi ba) {
        super(name);
        this.ba = ba;
    }

    public ChiHuo() {
    }

    public void run() {
        while (true) {
            synchronized (ba) {
                if (ba.isFlag() == true) {
                    System.out.println("包子真好吃");
                    //修改包子资源
                    ba.setFlag(false);
                    //通知包子铺做包子
                    //存在多个吃货，不确定包子铺是否等待时间最长的那条线程，需要唤醒所有线程
                    ba.notifyAll();
                    // ba.notify();//只通知单个线程的话，先唤醒等待时间最长的线程，所有的线程都会进入等待。
                } else {
                    try {
                        ba.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
