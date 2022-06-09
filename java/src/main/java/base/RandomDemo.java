package base;

import java.util.Random;

/*
1.解释：用来生成随机数
2.方法：
    ①public int nextInt(int n)随机生成0-指定范围内的随机数，
        nextInt(x)+y:
        x:范围内一共有x个数
        y:从y开始数
    ②public int nextInt()返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值

* */
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        // 随机生成一个整数
        int i = r.nextInt();
        System.out.println("i = " + i);

        // 随机生成指定范围内随机数  0-10
        for (int i1 = 0; i1 < 10; i1++) {
             i1 = r.nextInt(10);
            System.out.println("i1 = " + i1);
        }

        // 随机生成指定范围5-8内随机数
        int i3 = r.nextInt(4)+5;
        System.out.println(i3);




    }
}
