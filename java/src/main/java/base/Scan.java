package base;

import java.util.Scanner;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 * //求两个数的和，通过键盘获取两个数
 */
public class Scan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("请输入第一个数");
        int i = s.nextInt();
        System.out.println("你输入的第一个数是： " + i);
        System.out.println("请输入第二个数");
        int i1 = s.nextInt();
        System.out.println("你输入的第二个数是： " + i1);
        int sum=i+i1;
        System.out.println("总和 = " + sum);
        s.close();
    }
}
