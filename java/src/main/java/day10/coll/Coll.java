package day10.coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Collection（list，set,queue）单列集合：容器里面存储的元素单位是一个。
 * Map  双列集合：容器里面存储的元素单位是一对 k :v。
 * 接口、实现类、算法
 *
 * Collection 常用功能
 * Collection是所有单列集合的父接口
 * add(E e) ：把给定的对象添加到当前集合中 。
 * remove(E e) : 把给定的对象在当前集合中删除。
 * contains(E e) : 判断当前集合中是否包含给定的对象。
 * Empty() : 判断当前集合是否为空。
 * size() : 返回集合中元素的个数。
 * toArray() : 把集合中的元素，存储到数组中。
 * clear() :清空集合中所有的元素
 * <p>
 * 迭代器的注意事项：
 * 1.在用迭代器next()将指针进行移动，在一次遍历时，不要出现多次next()使用，否则发生异常
 * 2.在集合通过迭代器遍历的时候，这些步骤是一个整体，中间不要针对集合做任何添加、删除元素，否则会发生对象并发修改异常。
 * <p>
 * 泛型：一种未知的数据类型  格式：<数据类型>
 * 泛型和集合使用：针对集合中元素的数据类型进行条件约束
 * 注意事项：
 * 1.前后的泛型里面的数据类型要一致；
 * 2.数据类型可随意表示,不可以是基本数据类型，因为集合里是引用类型;
 * 2.JDK7.0之后简化为：集合的数据类型<元素的数据类型>=new 集合的数据类型<>();
 *
 * Collections:此类完全由在 collection 上进行操作或返回 collection 的静态方法组成
 */
public class Coll {
    public static void main(String[] args) {

        Collection coll = new ArrayList();  //多态集合，用的还是父接口的方法
        coll.add("abv");
        coll.add(123);   //自动装箱-->Object类型  注意不是String类型
        coll.add("efg");
        System.out.println(coll);  //[ ]
        coll.toString();

        coll.remove(123);
        coll.size();
        coll.isEmpty();
        Object[] objects = coll.toArray();
        objects.toString();
        char[] chars = "123".toCharArray();

        // Collection集合的遍历方式: ①迭代器
        Iterator it = coll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //② 增强for:底层是迭代器，没有索引的概念,不能对集合中的元素进行增删操作
        for (Object o : coll) {
            System.out.println(o);
        }

        //泛型
        ArrayList<String> list = new ArrayList<>();
        MyList<String> sList = new MyList<>();
        MyList<Integer> iList = new MyList<>();



        System.out.println(sList.getNum(1));
        System.out.println(sList.getNum("我的"));

        Integer[] a = {1, 2, 3};  //int 不行，包装类可以
        Object[] b = {"大", "数", "据"};

        System.out.println(sList.getArr(a));
        System.out.println(sList.getArr(b));

        sList.show(coll);
        sList.show2(coll);

        Collections.addAll(list,"a","1","d" );
        Collections.reverse(list);
        Collections.shuffle(list);


    }
}
