package day13.io;

import java.io.*;

/**
 * InputStream  字节流子类 ： FileInputStream
 * OutputStream 字节流子类 ： FileOutputStream
 * 字节流是int,末尾位是-1
 * <p>
 * reader：字符输入流
 * write： 字符输出流
 * 字符流是字符串，末尾位是null
 * 注意：字符输出流，在最后一步要做刷新后再关闭（什么时候刷新，内存中的数据什么时候进入文本文件）
 * 视频，音频，图片----字节流
 * 文本文件----------字符流
 * <p>
 * ① 字符缓冲流:
 * BufferedReader:public String readLine()读取一行文本。
 * BufferedWriter:public void newLine() throws IOException 写入一个行分隔符代替\n。
 * 缓冲
 * <p>
 * ② 高效流
 * 字节缓冲流： BufferedInputStream ， BufferedOutputStream
 * 字符缓冲流： BufferedReader ， BufferedWriter
 * 注意：
 * 1.高效流之所以高效，因为在构造器中缓存了一个长度为8192（8*1024）的数组，
 * 2.基本文件流缓冲数组长度=8192，效率跟高效流基本持平。推荐基本文件流+8192数组。
 * <p>
 */
public class Buff {
    public static void main(String[] args) throws IOException {

        //1.创建流对象，将已存在的一个文件加载进流
        FileReader read = new FileReader("input/out/a.txt");
        //1.创建流对象，将数据写入文件(可以不存在)
        FileWriter writer = new FileWriter("input/out/f.txt");


        char[] chars = new char[1024];
        read.read();                      //一次读取一个字节
        read.read(chars);                 //一次读取一个数组
        read.read(chars, 2, 3); //一次读指定位置的长度


        writer.write(97);       //一次写一个字符
        writer.write("中国梦".toCharArray()); //一次写出一个字符数组
        writer.write("大数据的".toCharArray(), 1, 2);
        writer.write("我的老家");
        writer.flush();

        BufferedReader br = new BufferedReader(read);
        BufferedWriter bw = new BufferedWriter(writer);
        System.out.println(br.readLine());


        bw.write("www");
        bw.newLine();  //换行

        System.out.println("=============================================================");

        //try-with-resource
        //创建文件输入流对象
        try (FileInputStream fi = new FileInputStream("input/out/a.txt")) {
            FileOutputStream fo = new FileOutputStream("input/out/e.txt", true);
            //创建字节缓冲流
            BufferedInputStream bi = new BufferedInputStream(fi);
            BufferedOutputStream bo = new BufferedOutputStream(fo);


            // test1(fi, fo);
            // test2(fi, fo);
            // test3(bi, bo);
            test4(br, bw);

            //关闭资源：先开后关
            bo.close();
            bi.close();
            fo.close();
            fi.close();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        bw.close();
        bw.close();
    }

    private static void test1(FileInputStream fi, FileOutputStream fo) throws IOException {

        /*b – the data.
        off – the start offset in the data.
        len – the number of bytes to write */
        int len;
        byte[] bytes = new byte[8192];
        while ((len = fi.read(bytes)) != -1) {
            fo.write(bytes, 0, len);
        }
    }

    private static void test2(FileInputStream fi, FileOutputStream fo) throws IOException {
        int len;
        while ((len = fi.read()) != -1) {
            fo.write(len);
        }
    }

    private static void test3(BufferedInputStream bi, BufferedOutputStream bo) throws IOException {
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bi.read(bytes)) != -1) {
            bo.write(bytes, 0, len);
        }
    }

    private static void test4(BufferedReader br, BufferedWriter bw) throws IOException {
        String len;
        while ((len = br.readLine()) != null) {
            bw.write(len);
        }
    }
}
