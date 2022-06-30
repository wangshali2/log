package test;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author wsl
 * @Description
 */
public class a {
    public static void main(String[] args) {

    }

    public void test(){

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

            }
        }, 10000L, 5000L);
    }
}
