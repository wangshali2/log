package thread.demo3;

/**
 * @author wsl
 * @version 2020-09-19
 */
public class Ticket implements Runnable {

    private int ticket = 100;
    Object o = new Object();//任何一个类的对象，都可以当锁，用this最简单，代表t对象。

    @Override
    public void run() {

        //  Object o=new Object();放这里不行，每调一次对象出现一把锁

        while (ticket > 0) {

            //窗口1,2,3
            synchronized (this) {      //锁放while外只会执行窗口1就结束了。
                this.notify();
                if (ticket > 0) {      //不加判断,窗口2,3不经过循环直接--
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}















