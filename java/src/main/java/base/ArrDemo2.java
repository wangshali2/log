package base;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * java.lang.reflect.Array
 * public final class Array extends Object
 * Array 类提供了动态创建和访问 Java 数组的方法。
 * public static Object get(Object array,int index)返回指定数组对象中索引组件的值
 * public static char getChar(Object array,int index)以 char 形式返回指定数组对象中索引组件的值。
 * <p>
 * Arrays类:
 * 1.类的解释
 * 是一个数组的工具类
 * 2.类的位置
 * java.util.Arrays
 * 3.类的构造器
 * 构造器被私有化,不能实例化对象
 * 4.类的方法
 * public static String toString(xxx[] a)返回指定数组内容的字符串表示形式
 * public static void sort(xxx[] a)对指定的 xxx 型数组按数字升序进行排序。
 * public static xxx[] copyOf(xxx[] original, xxx newLength)复制指定的数组,第二个参数:要复制的新数组的长度
 * <p>
 * Arrays类的注意事项:
 * 通过sort()比较自定义对象数组时,需要给其指定排序规则(后期讲解:比较器)
 * <p>
 * ==可以比较基本数据类型（数据值）和引用数据类型（内存地址值）；
 * equals（）只能比较引用数据类型
 * String、Date、File、包装类等都重写了equals方法，比较两个对象的实例内容是否相同
 * <p>
 * 动态创建和操作任意类型的数组
 * public static Object newInstance(Class<?> componentType,int length)创建一个具有指定的组件类型和长度的新数组
 * public static Object get(Object array,int index)返回指定数组对象中索引组件的值
 * public static void setInt(Object array,int index,int i)将指定数组对象中索引组件的值设置为指定的 int 值
 */
public class ArrDemo2 {
    public static void main(String[] args) {


        int[] arr = {33, 2, 77, 5, 99, 7, 3, 9};
        System.out.println(arr.toString());  //[I@1b6d3586
        Object o = Array.get(arr, 2);
        System.out.println(o);

        for (int i : arr) {
            System.out.println("for遍历：" + i);
        }

        int num = Array.getInt(arr, 2);
        System.out.println(num);

        //1
        int[] arr2 = Arrays.copyOf(arr, 4);

        //2
        Arrays.sort(arr);
        System.out.println(arr);  //[I@1b6d3586 数组

        System.out.println("遍历：" + Arrays.toString(arr));

        //3
        List<int[]> list = Arrays.asList(arr);
        System.out.println(list);  //[I@1b6d3586  数组

        List<String> list2 = Arrays.asList("1", "2", "3");
        System.out.println(list2);//[1, 2, 3]  集合


        //二分查找
        int c = Arrays.binarySearch(arr, 97);
        System.out.println("9的索引是：" + c);

        int[] a = {11, 22, 33};
        System.out.println(a);//[I@1b6d3586
        System.out.println(a.toString());//[I@1b6d3586
        char[] b = {97, 98, 99}; //8中基本类型特例
        System.out.println(b);//abc
        System.out.println(b.toString());//[C@4554617c


        /*   @Override
        public boolean equals(Object obj){
            if (this==obj){
                return true;
            }
            if (obj instanceof )
            return false;*/

        //通过反射动态创建一个长度为5的int类型的数组
        Object obj = Array.newInstance(int.class, 5);
        Array.setInt(obj,0,4);
        Array.setInt(obj,1,5);

        int anInt = Array.getInt(obj, 0);
        Object o1 = Array.get(obj, 1);

        System.out.println(anInt);
        System.out.println(o1);

        ArrayList<Object> objects = new ArrayList<>();
    }
}

