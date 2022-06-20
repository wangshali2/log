package day09.init.demo04;

/**
 * 基本数据类型--->String类型
 * 1.“+”
 * 2.Integer的toString方法
 * 3.Integer的toString(int i)方法
 * 4.String类的静态方法valueOf()；
 * <p>
 * String类型--->基本数据类型
 * 1.通过Integer 构造器+自动拆箱
 * 2.通过Integer的静态方法 static parseInt (String s) 推荐
 * 根据对应的类型选择对应的方法parseXXX (String s) ;
 * 在Character没有对应的方法
 */
public class BaoZhuang {
    public static void main(String[] args) {

        //1
        int num = 123;
        System.out.println(num + "");

        //2

        String s = new Integer(num).toString();

        //3
        String s2 = Integer.toString(num);

        //4
        String s3 = String.valueOf(num);
        System.out.println("=================================");


        //1
        int num05 = new Integer("123");

        //2
        int i1 = Integer.parseInt("123");

    }


}
