package day09.init.demo04;
/*
* 包装类的面试题1:
 * 		1.去常量池范围中找,如果找不到,在堆内存直接创建一个新地址值;
 * 		2.
 *
* */
public class BZ01 {
    public static void main(String[] args) {
        int num01 = 100;
        int num02 = 100;
        System.out.println(num01 == num02);//true

        Integer num03 = new Integer(200);//0x111
        Integer num04 = new Integer(200);//0x222
        System.out.println(num03 == num04);//false

        Integer num05 = 300;//先去常量池中去找,在范围内,直接指向常量池
        Integer num06 = 300;// 不在范围内,在堆内存直接创建一个新地址值
        System.out.println(num05 == num06);//false

        Integer num07 = 100;//常量池100
        Integer num08 = 100;//常量池100
        System.out.println(num07 == num08);//true

        int num09 = 20000000;
        Integer num10 = 20000000;
        // 如果基本数据类型和对应的包装类型进行比较,将包装类型进行自动拆箱然后再进行比较
        System.out.println(num10 == num09);//true
        System.out.println(num09 == num10);//true

    }
}
