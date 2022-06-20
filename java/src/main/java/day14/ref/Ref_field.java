package day14.ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * public Field getField(String name):public字段
 * public Field[] getFields()：public字段数组
 * public Field getDeclaredField(String name)：public+private所有字段。
 * public Field[] getDeclaredFields()：public+private所有字段。
 */
public class Ref_field {
    public static void main(String[] args) throws Exception {

        Class<?> clazz = Class.forName("day13.ref.Student");
        Constructor<?> con = clazz.getDeclaredConstructor(int.class, String.class, int.class, String.class);
        Object wsl = con.newInstance(18, "wsl", 001, "上海");

        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            System.out.println("属性:"+fields[i]);
        }

        Field address = clazz.getDeclaredField("address");

        Object add = address.get(wsl);
        System.out.println("add属性的值:"+add);

        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        Object a = age.get(wsl);
        System.out.println("age属性的值:"+a);

        Field id = clazz.getDeclaredField("id");
        Object i = id.get(wsl);
        System.out.println("id属性的值:"+i);

        System.out.println("====================================");
        Method getName = clazz.getDeclaredMethod("getName");
        Object name = getName.invoke(wsl);
        System.out.println(name);

        Method show = clazz.getDeclaredMethod("show", int.class, String.class, double.class);
        Object s = show.invoke(wsl, 1, "a", 3.14);
        System.out.println(s);

    }
}
