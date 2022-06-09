package ref;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * 获取Class对象的四种方式
 * 1.类型名.class
 * 2.通过Object类中的方法  对象.getClass()-需要创建对象，栈内存
 * 3.通过类加载器的实例方法loadClass()，ClassLoader的类加载器对象.loadClass(类型全名称)
 * 4.通过Class类的静态方法Class.forName(类型全名称)-----推荐
 * <p>
 * 类加载器是负责加载类的对象。ClassLoader 类是一个抽象类。
 */
public class Ref_con {
    public static void main(String[] args) throws Exception {

        ClassLoader cc = Class.forName("day13.ref.Student").getClassLoader();
        System.out.println(cc);

        System.out.println(ClassLoader.getSystemClassLoader());

        //1.知道具体的类
        Class<Student> stu = Student.class;

        //2.知道实例
        Class<? extends String> c1 = "".getClass();
        Class<? extends Class> c2 = stu.getClass();

        //3.
        Class<?> c4 = ClassLoader.getSystemClassLoader().loadClass("day13.ref.Student");

        //4.知道全类名
        Class<?> clazz = Class.forName("day13.ref.Student");

        System.out.println("=============================================================");

        //2.通过Class对象创建对象
        Object o = clazz.newInstance();
        System.out.println(o);  //Student{age=0, name='null'}

        //1.返回指定参数的public的构造器
        Constructor<?> strcon = clazz.getConstructor(String.class);
        System.out.println(strcon);

        //2.返回所有public的构造器数组
        Constructor<?>[] con2 = clazz.getConstructors();
        System.out.println(Arrays.toString(con2));

        //3.返回指定参数的构造器:public+private
        Constructor<?> con3 = clazz.getDeclaredConstructor(int.class);
        System.out.println(con3);

        //true则表示反射的对象在使用时应该取消Java语言访问检查,暴露反射
        con3.setAccessible(true);
        Object wsl = con3.newInstance(18);
        System.out.println(wsl);  //Student{age=18, name='wsl'}

        //4.返回所有的构造器数组:public+private
        Constructor<?>[] con4 = clazz.getDeclaredConstructors();
        System.out.println(Arrays.toString(con4));

        System.out.println("=====================================================");



    }
}
