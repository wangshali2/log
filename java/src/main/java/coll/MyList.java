package coll;

import java.util.Arrays;
import java.util.Collection;

/**
 * 含有泛型的类:当程序员需要使用含有泛型的类时，在创建对象时针对这个泛型确定,构造器里和类用T。
 * 格式：public class 类名<未知的数据类型>
 * <p>
 * 含有泛型的方法:当程序员需要使用含有泛型的方法时，在使用方法时针对这个泛型确定。
 * 格式：修饰符<未知的数据类型> 返回值类型 方法名（）{}
 * <p>
 * 含有泛型的接口:当程序员需要使用含有泛型的接口时，在使用接口时针对这个泛型确定。
 * public interface 类名<未知的数据类型>
 * <p>
 * 结论：如果想在类、接口、方法中使用泛型的概念，必须对泛型声明
 */


public class MyList<T> {

    public void add1(T t) {
    }

    //含有泛型方法
    public <T> T getNum(T t) {
        return t;
    }

    //含有泛型方法,public后不加<T> 则调用次方法的时候参数类型只能是String[]
    public <T> String getArr(T[] t) {
        return Arrays.toString(t);
    }


    //3.Collection是含有泛型的接口，在使用时需要确定Collection泛型的类型
    public <T> void show(Collection<T> coll) {

        for (T t : coll) {
            System.out.println(t);
        }
    }

    //4.简化版：？通配符代表使用了含有泛型的类或接口
    public void show2(Collection<?> coll) {
        for (Object o : coll) {
            System.out.println(o);
        }
    }

}


















