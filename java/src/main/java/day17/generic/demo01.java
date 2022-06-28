package day17.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * @Author wsl
 * @Description 泛型
 * interface List<T> 和 class GenTest<K,V>
 * 1.T,K,V不代表值，而是表示类型。这里使用任意字母都可以，常用T表示，是Type的缩写；
 * 2.T只能是类或者包装类，不能是基本数据类型；
 * 3.泛型的好处（相对于Object）：只有指定类型才可以添加到集合中：类型安全 读取出来的对象不需要强转：便捷
 */
public class demo01 {
    public static void main(String[] args) {
        //集合中使用泛型
        HashMap<Object, Object> map = new HashMap<>();

        // 1、使用时：类似于Object，不等同于Object
        ArrayList list = new ArrayList<>();
        // list.add(new Date());//有风险
        list.add("hello");

        test(list);// 泛型擦除，编译不会类型检查


        Object[] ao = new Object[100];
        Collection<Object> co = new ArrayList<Object>();
        fromArrayToCollection(ao, co);

        String[] sa = new String[20];
        Collection<String> cs = new ArrayList<>();
        fromArrayToCollection(sa, cs);

        Collection<Double> cd = new ArrayList<>();
        // T是Double类，但sa是String类型，编译错误。
        // fromArrayToCollection(sa, cd);
        // T是Object类型，sa是String类型，可以赋值成功。
        fromArrayToCollection(sa, co);


    }

    public static void test(ArrayList<String> list) {
        String str = "";
        for (String s : list) {
            str += s + ",";
        }
        System.out.println("元素:" + str);
    }

    public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {

        for (T t : a) {
            c.add(t);
        }
    }


}
