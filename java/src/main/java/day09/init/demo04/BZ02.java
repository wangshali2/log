package day09.init.demo04;
/*
*Integer包装类型的面试题2:静态和非静态的包装类常量都遵循取值范围规则
*                     3.=两边都为字面值常量(考虑自动拆箱)，JVM在编译之前自动将运算进行完毕，此时仍在常量池中；
* */
public class BZ02 {
    public static final Byte num01 = (byte) 100;
    public static final Byte num02 = (byte)100;
    public static final Integer num03 = 50;
    public static final Integer num04 = 50;
    public static final Integer num05;
    public static final Integer num06;
    public static final Integer num07;
    public static final Integer num08;

    static {
        num05 = 100;
        num06 = 100;
        num07 = 50;
        num08 = 50;
    }

    public static void main(String[] args) {
        System.out.println(num01 == num02);//true	比较的地址值
        System.out.println(num05 == num06);//true	比较的地址值
       // System.out.println(num01 == num05);//true	比较的地址值

        System.out.println("======================");

        System.out.println(num03 + num04 == num01);//true
        // 将num03 和 num04 自动拆箱为int,+常量池优化机制,比较的基本数据类型的数据值
        System.out.println(num07 + num08 == num01);//true
        // 将num07 和 num08 自动拆箱为int,+常量池优化机制,比较的基本数据类型的数据值
    }

}
