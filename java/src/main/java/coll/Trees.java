package coll;

import java.util.TreeSet;

/**
 * TreeSet
 * 1.数据结构：红黑树
 * 2.不可以存储null
 * 3.特点：实现排序
 *
 * String类型根据unicode码表数值排序
 * Integer类根据数字的大小排序
 * 自定义类型通过自然排序或定制排序，给其定制排序规则
 * 自然排序：让比较的类型实现Comparable<T>,重写抽象方法compareTo()(Integer,String都实现了),但这种写法违反了javaBean的标准.
 * 定制排序：让比较的类型实现Comparator<T>,重写接抽象方法compare(),
 */
public class Trees {
    public static void main(String[] args) {

        TreeSet<String> tree = new TreeSet<>();
        tree.add("a");
        tree.add("b");
        //  tree.add(null);  .NullPointerException

        TreeSet<Person> p = new TreeSet<>();
        p.add(new Person(1,"小白菜","18"));
        p.add(new Person(2,"李白","19"));
        p.add(new Person(3,"小黑","10"));
        p.add(new Person(4,"迪丽热巴","30"));
        p.add(new Person(5,"马尔扎哈","40"));

        System.out.println(p);  //[]
    }
}
