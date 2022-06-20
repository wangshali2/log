package day10.coll;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map 接口 Map<Key,Value>
 * key不能重复，value可以重复
 *
 * ①HashMap
 * 特点:
 * 1.HashMap集合底层是哈希表:查询的速度特别的快
 *   JDK1.8之前:数组+单向链表（为了解决冲突），容量默认是16
 *   JDK1.8之后:数组+单向链表|红黑树，容量默认是64
 * 2.hashMap集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致
 * 3.hashMap是一个线程不安全，效率高
 * 4.允许使用null值和null键的key只能有一个。
 **
 * <p>
 * 什么时候转成树形结构
 * 1.当链表长度达到8时；
 * 2.当链表的长度>64，如果达不到不会马上转换成树形结构，首先根据扩容原理，将数组的长度进行扩容2倍，
 * <p>

 * <p>
 * ②LinkedHashMap是HashMap的子类
 * 1.底层数据结构  哈希表+链表   链表保证哈希表元素的有序性
 * 2.LinkedHashMap是一个有序集合
 * 3.线程不同步，不安全
 *
 * Map遍历:通过Set集合存储所有的key找value值
 *
 * HashTable是线程安全的，不能有null值。
 */
public class Maps {
    public static void main(String[] args) {

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.remove("2");
        map.containsKey("2");
        map.put(null,"a");
        map.put(null,"b");

        System.out.println(map); //{1=a, 3=c, 4=d}

        //方法1.通过Set集合存储所有的key找value值
        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println(k+":"+map.get(k));
        }
        System.out.println(keys);
        System.out.println("-------------------------------------------");

        //方法2.通过Entry将键值对的对应关系封装成了对象即键值对对象
        Set<Map.Entry<String, String>> set = map.entrySet();

        for (Map.Entry<String, String> s : set) {
            System.out.println(s.getKey()+":"+s.getValue());
        }

    }
}
