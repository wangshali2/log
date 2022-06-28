package test;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author wsl
 * @Date 2022-06-20-15:49
 * @Description
 */
public class test {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> clazz = Class.forName("test.test");
        show(clazz);
    }



    public static void show(Class clazz) {
        Type genType = clazz.getGenericSuperclass();
        Type[] types = ((ParameterizedType) genType).getActualTypeArguments();
        // Class<T> type = (Class<T>) types[0];
        System.out.println(types);

    }
}

