package day04.thread.demo2;

/**
 * @Author wsl
 * @Date 2021-08-13
 * @Description
 * @Version 1.0
 */
public class DianPu extends Thread {

    private BaoZi baoZi;

    public DianPu() {
    }


    public DianPu(String name, BaoZi baoZi) {
        super(name);
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                if (baoZi.isFlag()==true){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("包子铺开始做包子，包子做好了通知吃货");
                    baoZi.setFlag(true);
                    baoZi.notify();  //唤醒等待线程
                    System.out.println();
                }
            }
        }
    }
}
