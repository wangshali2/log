package day01.base;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ==可以比较基本数据类型（数据值）和引用数据类型（内存地址值）；
 * equals（）只能比较引用数据类型
 * String、Date、File、包装类等都重写了equals方法，比较两个对象的实例内容是否相同
 */
public class ArrDemo2 {
    public static void main(String[] args) {


        int[] arr = {33, 2, 77, 5, 99, 7, 3, 9};
        //获取指定元素
        System.out.println(Array.get(arr, 2));
        System.out.println(Array.getInt(arr, 2));

        //遍历
        for (int i : arr) {
            System.out.println( i);
        }


        int[] arr2 = Arrays.copyOf(arr, 4);

        Arrays.sort(arr);
        System.out.println("遍历：" + Arrays.toString(arr));  //遍历

        List<int[]> list = Arrays.asList(arr);

        List<String> list2 = Arrays.asList("1", "2", "3");
        System.out.println(list2);//[1, 2, 3]  集合


        //二分查找
        int c = Arrays.binarySearch(arr, 97);
        System.out.println("9的索引是：" + c);



        /*   @Override
        public boolean equals(Object obj){
            if (this==obj){
                return true;
            }
            if (obj instanceof )
            return false;*/

    }
}

