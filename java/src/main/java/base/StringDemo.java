package base;

import java.util.Arrays;

/**
 * java.lang.StringBuilder:一个可变的字符序列
 * 1.底层数据结构:数组，初始长度：16
 * 2.自动扩容规则
 * JDK8.0及以后：(底层数组.length<<1)+2   都是34 ，但效率更高
 * JDK7.0:(底层数组.length*2)+2
 * JDK6.0及之前:(底层数组.length+1)*2
 * <p>

 * String：
 * 1:不可变的字符序列，底层数组被final修饰
 * 2.底层数组类型：3者都一样,在JDK8.0之前是字符数字，在JDK9.0之后是字节数组
 * 3.应用版本：JDK1.0
 * *
 * StringBuilder：
 * 1:可变的字符序列，底层数组没有被final修饰
 * 3.应用版本：JDK1.5
 * 4.线程安全性：线程不同步不安全，执行效率高
 * 5.涉及到安全的问题也是用它
 * *
 * StringBuffer：
 * 1:可变的字符序列，底层数组没有被final修饰
 * 3.应用版本：JDK1.0
 * 4.线程安全性：线程同步安全，执行效率低
 * <p>
 * String 类代表字符串。
 * 1.Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现，在Java语言中所有的""都是字符串的对象
 * 2.字符串本身是一个常量；它们的值在创建之后不能更改。字符串底层数据结构是数组，该数组被final修饰
 * 3.JDK8.0之前底层数据结构是一个字符数组；JDK9.0之后底层数据结构是一个字节数组；
 * 4.为什么要转换成字节数组？字节在理论上的空间比字符串减少了一半，字符还要转成字节码文件，字节和二进制位转换效率比字符效率高。
 * 5.为什么字符串类型可以保存汉字？String 代表UTF-16的字符串
 * 6.“” 和null区别
 * ""代表字符串的实例，可以通过"".进行方法的调用。String str=new String(null)编译报错，不可实例化字符串对象
 * null是一个字面值常量，作为引用数据类型的的默认值存在，无论是对象还是数组，通过null访问对象或数组中的属性和方法都会空指针异常。
 * <p>
 *
 * <p>
 * 预定义字符类
 * . 任何字符（与行结束符可能匹配也可能不匹配）
 * \d 数字：[0-9]
 * \D 非数字： [^0-9]
 * \s 空白字符：[ \t\n\x0B\f\r]
 * \S 非空白字符：[^\s]
 * \w 单词字符：[a-zA-Z_0-9]
 * \W 非单词字符：[^\w]
 * <p>
 * 字符类
 * [abc] a、b 或 c（简单类）
 * [^abc] 任何字符，除了 a、b 或 c（否定）
 * [a-zA-Z] a 到 z 或 MyAr 到 Z，两头的字母包括在内（范围）
 */
public class StringDemo {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        StringBuffer ss = new StringBuffer("abc");

        System.out.println(s);
        System.out.println(ss);


        //往StringBuilder对象中添加字符串
        System.out.println("s=" + s.append("abc"));
        //将字符串插入此字符序列
        System.out.println("s=" + s.insert(2, "java"));
        //将字符串反转
        System.out.println("s=" + s.reverse());

        //1.直接赋值初始化(推荐)
        String s1 = "abc";

        //2.创建一个空白字符串对象
        String s2 = new String();

        //3.通过一个字符串对象创建一个字符串对象
        String s3 = new String("abc");

        //4.通过字节数组创建一个字符串
        byte[] bs = {99, 98, 97};
        String s4 = new String(bs);
        System.out.println("s4" + s4);

        //5.通过字符数组创建一个字符串
        char[] cs = {97, 98, 99};
        String cs1 = new String(cs);
        System.out.println("cs1" + cs1);

        System.out.println("---------------常用方法----------------");

        //获取长度
        System.out.println("length=" + s1.length());//length是方法，数组不带(),因为length是数组的属性

        //将指定的字符串连接到该字符串的末尾,返回String类型
        s1.concat("123");
        String ns = s1.concat("123");
        System.out.println("s=" + s);//原字符串不变
        System.out.println("ns=" + ns);

        //返回指定索引处的 char值
        char c = s.charAt(2);
        System.out.println("c=" + c);
        // char c1 = s.charAt(200);StringIndexOutOfBoundsException

        //返回指定子字符串第一次出现在该字符串内的索引
        int i = s.indexOf("ess");//-1
        System.out.println("i=" + i);

        //返回一个子字符串，从beginIndex开始截取字符串到字符串结尾[)
        String substring = s.substring(4);
        System.out.println("substring=" + substring);//substring=不会报错
        String substring1 = s.substring(4, 7);
        System.out.println("substring1=" + substring1);

        System.out.println(Arrays.toString(s1.split("t")));

        //将此字符串转换为新的字符数组。
        char[] chars = s1.toCharArray();
        String c1 = chars.toString();
        System.out.println("s1=" + c1);
        //用replacement字符串替换target
        System.out.println(s1.replace("abc", "123"));

        //遍历字符串
        for (int j = 0; j < s.length(); j++) {
            System.out.println(s.charAt(j));
        }

        //System.out.println(Arrays.toString(s1));

        //使用平台的默认字符集将该 String编码转换为新的字节数组。
        byte[] bytes = s1.getBytes();
        String b2 = Arrays.toString(bytes);
        String b3 = bytes.toString();

        System.out.println("s2=" + s2);
        //  System.out.println("s3=" + s3);

        //遍历数组
        byte[] bytes2 = "wsl".getBytes();
        System.out.println(Arrays.toString(bytes2));

    }
}
