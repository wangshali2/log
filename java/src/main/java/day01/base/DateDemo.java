package day01.base;
/**
 * ① Date
 * 位置：java.util.Date
 * 解释：表示特定的瞬间
 * 构造器：
 * public Date()分配 Date 对象并初始化此对象，以表示分配它的时间
 * public Date(long date)分配 Date 对象并初始化此对象
 * 方法：public long getTime()返回自 1970.1.1  00:00:00 GMT 以来此 Date 对象表示的毫秒数
 * <p>
 * ② SimpleDateFormat
 * 位置：java.text.SimpleDateFormat
 * 解释：是一个以与语言环境有关的方式来格式化和解析日期的具体类
 * 构造器：public SimpleDateFormat(String pattern)用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
 * 继承父类 DateFormat方法：
 * 1.public final String format(Date date)将一个 Date 格式化为日期/时间字符串。
 * 2.public Date parse(String source)throws ParseException从给定字符串的开始解析文本，以生成一个日期
 * <p>
 * <p>
 * 格式化（日期->文本）步骤；
 * 1，定义并初始化日期对象
 * 2.定义并初始化SimpleDateFormat格式化解析类的对象
 * 3.调用格式化解析类的方法format()，得到最终格式化文本。
 * <p>
 * 解析（文本->日期）步骤；
 * 1，定义并初始化SimpleDateFormat格式化解析类的对象
 * 2.定义待解析的日期文本
 * 3.调用格式化解析类的方法parse()，得到最Date对象
 * <p>
 * ③ Calendar 类是一个抽象类，不能实例化
 * 解释：第二代日期类
 * 位置：java.util.Calendar
 * 获得对象：Calendar rightNow = Calendar.getInstance();
 * 方法：
 * public int get(int field)返回给定日历字段的值
 * public void set(int field,int value)将给定的日历字段设置为给定值
 * <p>
 * 第三代日期类
 * LocalDate、LocalTime、LocalDateTime——》Calendar类
 * Instant——》Date类
 * DateTimeFormatter——》SimpleDateFormat类
 * <p>
 * System类
 * 位置：java.lang.System
 * 解释：System 类包含一些有用的类字段和方法。
 * 构造器：私有化，它不能被实例化。
 * 方法：
 * ①public static long
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class DateDemo {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        System.out.println(date);//无参构造器  Mon Jun 20 15:35:03 CST 2022

        Date date1 = new Date(8L);
        System.out.println(date1);//有参构造器
        System.out.println(date.getTime());  //时间戳  1655710503996

        test();//格式化
        test02();//解析
        show();
        Calend();


        long l = System.currentTimeMillis();


    }

    //解析成时间戳
    private static void test02() throws ParseException {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒sss毫秒");
        String str = "2020年09月11日 15时36分29秒029毫秒";
        Date parse = sd.parse(str);
        System.out.println("parse" + parse);

    }

    //格式化
    private static void test() {

        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒sss毫秒");
        String format = sd.format(date);
        System.out.println("format=" + format);

    }

    //LocalDateTime
    public static void show() {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getYear() + "年" + now.getMonthValue() + "月" + now.getDayOfMonth() + "日");

    }

    public static void Calend() {

        Calendar c = Calendar.getInstance();   //静态方法
        System.out.println(c.getClass());  //class java.util.GregorianCalendar
        System.out.println(c);
        System.out.println(c.getTime());   //Thu Aug 12 10:31:21 CST 2021

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month  + "月"+date);
        c.add(Calendar.YEAR, 1000);//增大年
    }
}
