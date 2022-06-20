package day10.coll;

import java.util.*;

/**
 * List及所有的实现类都有的特点：
 * 1.是一个含有索引的集合
 * 2.是一个有序集合,可存重复值
 * 3.List集合所有的元素是以一种线性方式进行存储的，
 * <p>
 * 方法:Collection的方法List都可以用
 * <p>
 * ①ArrayList集合的特点：
 * 1.底层数据结构是数组，数组结构的特点：相比链表结构查询效率高（索引），增删效率慢（new）
 * 2.线程不同步，效率高
 *
 * <p>
 * ②LinkedList集合的特点
 * 1.底层数据结构是链表(双向) 链表的特点：相比数组结构查询效率低，增删效率高
 * 2.线程不同步，，效率高
 *
 * <p>
 * ③Vector
 * 1.底层数据结构是数组
 * 2.线程同步，效率低，被ArrayList集合取代了
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

        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("start");
        ll.addLast("end");



    }
}
