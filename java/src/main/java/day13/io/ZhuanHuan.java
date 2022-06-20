package day13.io;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * 转换流 InputStreamReader
 * <p>
 * InputStreamReader(InputStream in) : 创建一个使用默认字符集的字符流。
 * InputStreamReader(InputStream in, String charsetName) : 创建一个指定字符集的字符流。
 * <p>
 * properties属性集
 * 1.解释：实现Map接口  唯一一个和IO有直接连接的集合类
 * 2.位置java.util.Properties
 * 3.构造器public Properties() :创建一个空的属性列表。
 * 4.方法
 * public void load(InputStream inStream)从输入流中读取属性列表（键和元素对）。
 * public Set<String> stringPropertyNames()返回此属性列表中的键集
 */
public class ZhuanHuan {
    public static void main(String[] args) throws Exception {

      /*  InputStreamReader ir = new InputStreamReader(new FileInputStream("input/out/a.txt"), "utf8");
        OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("input/out/e.txt"));
        int len;
        while ((len = ir.read()) != -1) {
            ow.write(len);
        }

        ow.close();
        ir.close();*/


     /*   //打印流 快速写入记事本中
        PrintStream ps = new PrintStream("input/out/e.txt");
        ps.write("哈哈哈".getBytes(StandardCharsets.UTF_8));
        ps.write("abc".getBytes());
        System.setOut(ps);
        System.out.println(ps+"66666666");
        ps.close();*/


        Properties prop = new Properties();
        prop.load(new FileInputStream("D:\\code\\w\\src\\main\\resources\\abc.properties"));

        //获取所有键值
        Set<String> keys = prop.stringPropertyNames();
        for (String k : keys) {
            System.out.println(k + ":" + prop.get(k));
        }
    }
}
