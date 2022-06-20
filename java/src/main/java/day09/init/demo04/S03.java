package day09.init.demo04;

/**
 * 字符串面试题3:
 * 在内存中有几个字符串对象（不含栈内存）
 * String s1 = new String ("abc");
 * 答案:2个
 * 1.在常量池中创建一个"abc"对象
 * 2.在堆内存创建一个字符串对象将常量池中的地址赋值过去
 * String s2 = "a" + "b" + "c";
 * 答案:1个
 * 1.唯一的一个,进行相加的都是字面值常量,所以在运行前自动合并为"abc"一个对象,常量池优化机制
 */
public class S03 {
    public static void main(String[] args) {
        //在内存中有几个字符串对象（不含栈内存）
        //1.在常量池中创建一个"abc"对象
        //2.在堆内存创建一个字符串对象将常量池中的地址赋值过去
        String s1 = new String("abc");//2个

        //进行相加的都是字面值常量,所以在运行前自动合并为"abc"一个对象,常量池优化机制
        String s2 = "a" + "b" + "c";//1个

        String str1 = "a";//常量池1"a"
        String str2 = "b";//常量池2"b"
        String str3 = "c";//常量池3"c"

        String s3 = str1 + str2 + str3;//正确答案:5个
        /**
         * str1 + str2  堆4 "ab"
         *
         * 堆4 + str3  堆5 "abc"
         */
    }
}
