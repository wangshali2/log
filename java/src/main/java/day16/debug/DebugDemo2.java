package day16.debug;

import day04.thread.demo1.MyThread;

/**
 * @Author wsl
 * @Date 2022-04-06-11:51
 * @Description
 */
public class DebugDemo2 {
    public static void main(String[] args) {
       // conditions();
       // saveResource();
        keyExplain();
    }

    public static void conditions(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);  //i%2==0，偶数才触发断点
        }

        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread, "1");
        Thread t2 = new Thread(myThread, "2");
        Thread t3 = new Thread(myThread, "3");

        t1.start();
        t2.start();
        t3.start();
    }

    //取消下面代码的执行（方法进栈了，就要出栈，出栈了代码就会全部走完）
    public  static  void saveResource(){
        System.out.println("mysql");
        System.out.println("redis"); //代码输出到这行不想走了，点击frame->强制返回。丢弃当前帧只是让回到方法进入之前
        System.out.println("es");
        System.out.println("kafka");
    }

    public static void keyExplain(){
        System.out.println("key");
        //step over
        System.out.println("step over");

        //step into | step out
        System.out.println("step into |step out");
        ServiceImp serviceImp = new ServiceImp();
        serviceImp.show();

        //force step into
        StringBuffer sb = new StringBuffer();
        sb.append("hello"); //跳入append内部
        System.out.println(sb.toString());


        //run to cursor
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("bbb");
        System.out.println("bbb");  //不想一步步执行，只能光标定位到当前行，点run to cursor
    }



}
