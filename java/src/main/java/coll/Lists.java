package coll;

import java.util.*;

/**
 * List及所有的实现类都有的特点：
 * 1.是一个含有索引的集合
 * 2.是一个有序集合,有序：存入顺序和取出顺序一致
 * 3.可以存储重复值
 * 4.有4种遍历方式
 * 5. List集合所有的元素是以一种线性方式进行存储的，
 * <p>
 * 方法:Collection的方法List都可以用
 * <p>
 * ①ArrayList集合的特点
 * 1.具体List的4个特点；
 * 2.ArrayList底层数据结构是数组
 * 数组结构的特点：相比链表结构查询效率高（索引），增删效率慢（new）
 * <p>
 * 3.创建ArrayList集合初始大小取决于构造器
 * public ArrayList(Collection<? extends E> c)初始长度：根据参数集合构建数组大小(少用)
 * public ArrayList(int initialCapacity)初始长度：自定义
 * public ArrayList()JDK6.0之前：初始长度为10；饿汉式
 * JDK7.0之后：初始长度为0； 懒汉模式，当第一次添加元素时才构建长度为10的数组
 * 4.数组如何自动扩容
 * JDK6.0之前：（原来数组的长度*3）/2+1；
 * JDK7.0之后：原来数组的长度+（原来数组的长度>>1）；
 * <p>
 * 5.线程安全性：不是一个线程安全的集合，效率高
 * 1.2版本新增ArrayList集合
 * <p>
 * ②LinkedList集合的特点
 * 1.具体List的4个特点；
 * 2.LinkedList底层数据结构是链表(双向)
 * 根据链表结构的数据划分：
 * 单向链表：本身数据 下一个元素
 * 双向链表：上一个数据 本身数据 下一个元素
 * 链表构的特点：相比数组结构查询效率低，增删效率高
 * 3.线程安全性：线程安不全的集合，效率高
 * 1.2版本新增LinkedLi集合
 * 4.如果查询偏多---->ArrayList;如果增删偏多---->LinkedList
 * <p>
 * ③Vector
 * 1.具体List的4个特点；
 * 2.Vector底层数据结构是数组
 * 数组结构的特点：相比链表结构查询效率高（索引），增删效率慢（new）
 * <p>
 * 3.创建Vector集合初始大小取决于构造器
 * public Vector(Collection<? extends E> c)初始长度：根据参数集合构建等长的数组大小(少用)
 * public Vector(int initialCapacity)初始长度：自定义
 * public Vector()  初始长度为:10
 * Vector在JDK1.2版本之后代码就没有修改过
 * 4.数组如何自动扩容：原来数组的长度+原来数组的长度；
 * 5.线程安全性：Vector是一个线程安全的集合，效率低
 * 1.2版本后被ArrayList集合取代了
 */
public class Lists {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add(1, "c");
        list.get(2);
        list.set(2, "d");
        list.remove(2);
        list.remove("a");
        list.size();
        System.out.println(list);  //[]

        //1.种遍历方式
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("1.种遍历方式" + it.next());
        }

        //2.种遍历方式
        for (String s : list) {
            System.out.println("2.种遍历方式" + s);
        }

        //3.种遍历方式
        for (int i = 0; i < list.size(); i++) {
            System.out.println("3.种遍历方式普通的for" + list.get(i));
        }

        //4.种遍历方式list集合特有的
        ListIterator<String> slt = list.listIterator();
        while (slt.hasNext()) {
            System.out.println(slt.next());
        }

        LinkedList<String> ss = new LinkedList<>();
    }
}
