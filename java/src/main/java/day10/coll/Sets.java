package day10.coll;

import java.util.HashSet;
import java.util.Iterator;

/**
 * ①set
 * 1.set集合元素不重复
 * 2.set集合没有索引值
 * 3.set集合可以有null元素
 * 4.set集合包含有序和无序集合，LinkedHashSet类是有序的
 * 元素无序（针对类）
 * 5.set集合的遍历方式只有：1.迭代器 2.增强for
 * <p>
 * <p>
 * ②子类LinkedHashSet：
 * 1.LinkedHashSet集合元素不重复
 * 2.LinkedHashSet集合没有索引值
 * 3.LinkedHashSet集合最多包含一个null元素
 * 4.LinkedHashSet集合底层是哈希表（实际上是一个 HashMap 实例）
 * 哈希表：JDK7.0（包含）之前哈希表是数组+链表；JDK8.0（包含）之后哈希表是数组+链表  或者  数组+红黑树
 * 链表：记录元素存储的顺序，保证迭代顺序。
 * 5.LinkedHashSet集合是有序的
 * 6.LinkedHashSet集合是JDK1.4版本新增的，所以线程不安全，执行效率高
 * <p>
 * <p>
 * ③HashSet：
 * 1.HashSet集合元素不重复
 * 2.HashSet集合没有索引值
 * 3.HashSet集合最多包含一个null元素
 * 4.HashSet集合底层是哈希表（实际上是一个 HashMap 实例）
 * 哈希表：JDK7.0（包含）之前哈希表是数组+链表；JDK8.0（包含）之后哈希表是数组+链表  或者  数组+红黑树
 * 链表：模拟索引
 * 5.HashSet集合是无序的
 * 6.HashSet集合是JDK1.2版本新增的，所以线程不安全，执行效率高
 * <p>
 * 没有重写equals()和hashcode（）之前可以添加重复的，因为Person里没有这两个方法，所以是两个地址值
 * 保证HashSet里元素唯一性的原理:
 * 1.调用元素重写Object类的hashCode()方法；
 * 2.调用元素重写Object类的equals()方法；
 *
 * hashCode()方法中为什么*31
 * 1.默认的数字不能太大，否则当字符串h会超出int的取值范围
 * 2.默认的数字不能太小，否则字符串h重复的概率太大；
 * 3.为了降低h的重复性，选择质数（29/31）；
 * 4.31和整数取值范围格式一样的  31=2……7-1
 */
public class Sets {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("a");
        set.add(null);
        System.out.println(set);  //[]

        Iterator<String> s = set.iterator();
        while (s.hasNext()) {
            System.out.println(s.next());
        }

        for (String s1 : set) {
            System.out.println(s1);
        }

        HashSet<Person> p = new HashSet<>();
        System.out.println(set.hashCode());
        boolean f2 = p.add(new Person(3, "小红", "333"));
        boolean f1 = p.add(new Person(3, "小红", "333"));
        System.out.println(f2);//true
        System.out.println(f1);//false

        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.getClass());
        System.out.println(s2.getClass());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }

 /*   public int hashCode() {
           int h = hash;
           if (h == 0 && value.length > 0) {
               char val[] = value;

               for (int i = 0; i < value.length; i++) {
                ;  h = 31 * h + val[i]
                                      }
              hash = h;
          }
           return h;
       } */
}
