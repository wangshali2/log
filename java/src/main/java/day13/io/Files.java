package day13.io;

import java.io.File;
import java.io.IOException;

/**
 * File
 * 位置：java.io.File
 * 类的解释：文件和目录路径名的抽象表示形式。
 * 构造器：public File(String pathname)通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例
 * 一个File对象代表硬盘中实际存在的一个文件或者目录。无论该路径下是否存在文件或者目录，都不影响File对象的创建。
 * <p>
 * 1.获取功能的方法
 * public String getAbsolutePath() ：返回此File的绝对路径名字符串。
 * public String getPath() ：将此File转换为路径名字符串。
 * public String getName() ：返回由此File表示的文件或目录的名称。
 * public long length() ：返回由此File表示的文件的长度。
 * <p>
 * 绝对路径：从盘符开始的路径，这是一个完整的路径。
 * 相对路径：相对于项目目录的路径，这是一个便捷的路径，开发中经常使用。
 * <p>
 * 2.判断方法
 * public boolean exists() ：此File表示的文件或目录是否实际存在。
 * public boolean isDirectory() ：此File表示的是否为目录。
 * public boolean isFile() ：此File表示的是否为文件。
 * <p>
 * <p>
 * 3.创建删除功能的方法
 * public boolean createNewFile() ：路径真实存在，文件不存在时创建一个新的空文件。
 * public boolean delete() ：删除由此File表示的文件或目录。
 * public boolean mkdir() ： 创建由此File表示的目录。
 * public boolean mkdirs() ：创建由此File表示的目录，递归创建
 * <p>
 * 目录的遍历
 * public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录
 * public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录
 *
 */
public class Files {
    public static void main(String[] args) throws IOException {

        File f1 = new File("input/out");
        File f2 = new File("D:\\work\\a");
        System.out.println(f2);
        System.out.println(f2); //不存在也能打印出来

        System.out.println(f2.getName());//如果是文件带扩展名  a.txt
        System.out.println(f2.length());//返回文件的大小，单位是字节
        System.out.println("绝对路径  " + f1.getAbsolutePath());//盘符路径D:\code\w\input\a.txt
        System.out.println("构造路径  " + f1.getPath());//input\a.txt

        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());

        /*
        f2.delete();
        f2.mkdir();
        f2.mkdirs();*/

        //遍历该目录
        System.out.println("--------------------------");
        String[] list = f1.list();
        for (String file : list) {
            System.out.println(f1.getAbsolutePath() + "\\" + file);
        }

        Getpath(f1);



    }

    private static void Getpath(File file) {

        File[] files = file.listFiles();

        for (File f : files) {

            if (f.isFile()) {
                System.out.println("文件:" + f);
            } else {
                System.out.println("目录:" + f);
               Getpath(f);
            }
        }
    }
}
