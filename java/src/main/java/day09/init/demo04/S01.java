package day09.init.demo04;
/**
 * String类的面试题1:
 * 		== 比较的是地址值
 *
 * 常量池作用:用于存储常量
 *
 * 常量池特点:
 *		如果创建的数据在常量池中存在,不会创建新的数据,直接将已有数据拿出使用
 *
 * 常量池的好处:
 * 		提高常量池中数据的复用性
 *
 *注意事项:
 * 		1.String类如果通过new创建对象,对象直接位置:堆;如果通过直接赋值的方式,数据在常量池
 *由于String类的对象内容不可改变，所以每当进行字符串拼接时，总是会在内存中创建一个新的对象。
 */
public class S01 {
    public static void main(String[] args) {
        String s1 = "HelloWorld";//常量池
        String s2 = "HelloWorld";//常量池
        String s3 = new String("HelloWorld");//0x111
        String s4 = new String("HelloWorld");//0x222
        String s5 = "Hello";//常量池
        String s6 = "World";//常量池
        String s7 = new String("Hello");//0x333
        String s8 = new String("World");//0x444
        System.out.println(s3 == s4);//false
        System.out.println(s1 == s2);//true
        System.out.println("=================================");
        System.out.println(s7 + s8 == s3);//false  (s7+s8) 0x555
        //s5是变量,s6是变量,字符串拼接(不是字面值常量)相当于在堆内存创建一个新的字符串
        System.out.println(s5 + s6 == s1);//false  (s5+s6) 0x666
        System.out.println(s7 + s8 == s1);//false
        // 常量池优化机制,+两边都为字面值常量(考虑自动拆箱)在编译前做连接运算，此时在常量池中；
        System.out.println("Hello" + "World" == s1);//true

    }
}
