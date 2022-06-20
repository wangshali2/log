package day13.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 对象流：   对象输入流--反序列化              ObjectInputStream
 * 对象输出流---序列化              ObjectOutputStream
 * <p>
 * public final void writeObject(Object obj) 将指定的对象写入 ObjectOutputStream文件中。
 * public final Object readObject()从 ObjectInputStream 读取对象
 * <p>
 * 序列化步骤：
 * 1.操作对象对应的类实现Serializable序列化接口
 * 2.创建对象输出流对象
 * 3.创建操作对象
 * 4.调用对象输出流写出对象的方法writeObject();
 * 5.关闭资源
 * <p>
 * 1.在序列化的过程中，不可以改动文件
 * 2.该类的所有属性必须是可序列化的。如果有一个属性不需要可序列化，用瞬态的 transient 关键字修饰。
 * <p>
 * 反序列化步骤：
 * 1.操作对象对应的类实现Serializable序列化接口
 * 2.创建对象输出流对象
 * 3.调用对象输入流读取对象的readObject()方法;
 * 5.关闭资源
 */

public class ObjectDemo {
    public static void main(String[] args) throws Exception {

        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("input/out/e.txt"));
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("input/out/e.txt"));
        Student student = new Student("zs", 11);
        obj.writeObject(student);

        Student stu = (Student) oi.readObject();
        System.out.println(stu.getAge() + "====" + stu.getName());

        oi.close();
        obj.close();


    }
}
