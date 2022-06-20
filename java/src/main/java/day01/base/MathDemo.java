package day01.base;

/**
 * Math类:
 * 1.类的解释
 * Math 类包含用于执行基本数学运算的方法
 * 2.类的位置
 * java.lang.Math
 * 3.类的构造器
 * 私有化构造器
 * 4.类的变量和方法
 * public static final double PI比任何其他值都更接近 pi（即圆的周长与直径之比）的 double 值。
 * public static double random()返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
 *
 * 应用Math.random生成指定范围内的随机整数
 * (int)(Math.random() * x) + y;
 * x : 这个范围内有多少个数据,这个x的值就是多少
 * y : 这个数据范围的起始位置
 */
public class MathDemo {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println(random);

        //生成一个0-99之间的整数
        int num = (int) (Math.random() * 100);
        System.out.println(num);

        //生成一个1-100之间的整数
        num = (int) (Math.random() * 100) + 1;
        System.out.println(num);

        //生成一个5-8之间的整数
        num = (int) (Math.random() * 4) + 5;
        System.out.println(num);
    }
}
