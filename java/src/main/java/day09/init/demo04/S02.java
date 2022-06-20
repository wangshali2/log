package day09.init.demo04;

/**
 * String面试题2:
 * JVM自动将自定义常量直接赋值初始化当成字面值常量看待.符合常量池优化机制
 */
public class S02 {
    public static final String s1 = "HelloWorld";
    public static final String s2 = "HelloWorld";
    public static final String s3 = "Hello";
    public static final String s4 = "World";
    public static final String s5;
    public static final String s6;
    public static final String s7;
    public static final String s8;

    static {
        s5 = "HelloWorld";
        s6 = "HelloWorld";
        s7 = "Hello";
        s8 = "World";
    }

    public static void main(String[] args) {
        System.out.println(s1 == s2);//true
        System.out.println(s5 == s6);//true
        System.out.println(s1 == s5);//true

        System.out.println("====================");

        //把s3和s4当成字面值常量,符合常量池优化机制,在编译时,
        // 自动将"HelloWorld"拼接到一起  "HelloWorld" == s1
        System.out.println(s3 + s4 == s1);//true
        // 因为s7和s8不是直接赋值初始化,初始化值有一定的不确定性,把s7和s8当成普通的变量进行计算
        // 将s7和s8拼接好的HelloWorld在堆内存创建一个新的出来
        System.out.println(s7 + s8 == s1);//false
    }

}
