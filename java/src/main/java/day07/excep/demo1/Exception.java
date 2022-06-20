package day07.excep.demo1;

import java.io.*;

/**
 * 异常的分类：
 * ①运行时期异常：代码没有语法格式错误，在运行时期发生异常。特点：自己可以不用处理，如果不出来，JVM自动帮助我们处理
 * JAM的处理方案：
 * 1.调用异常类中的print()，打开异常的详情信息
 * 2.强转终止程序
 * <p>
 * ②编译时期异常：代码没有语法格式错误，在编译时期发生异常，特点：必须手动处理
 * 手动处理解决方案：
 * 1.异常在方法上的声明：自己不处理，交给调用的方法处理，如果有多层方法的调用，多个方法都处理不了的情况下，最终交给JVM处理；
 * 2.异常的捕获：谁都不求，自行解决。
 * <p>
 * 子父类异常存在继承关系，异常的声明可以只写父类
 * <p>
 * 异常的注意事项：继承
 * 1.声明的多个异常类之间存在子父类继承关系，异常声明时，子类异常和父类异常谁在前后顺序无所谓；当某个方法存在多个异常时，可以声明这几个异常的父类，简化代码。
 * 2.含有异常类的代码出现子父类继承关系
 * a.含有异常类的代码出现父类的方法，如果子类继承了这个方法，子类无需理会父类的异常信息。
 * b.含有异常类的代码出现子类的方法，在子类重写父类/父接口的方法中有异常信息，手动解决方案只能一种：异常的捕获，（重写需要在父类声明异常，避免改动父类代码）。
 * <p>
 * 异常捕获的注意事项
 * 1.在多个异常类之间存在子父类继承关系
 * a.针对多个异常分别捕获，分别处理（推荐）
 * b.针对多个异常一次捕获，一次处理
 * 注意：如果一次捕获，多次处理时，需要将子类的catch写在上面，或者直接处理一个父类即可。
 * c.针对多个异常一次捕获，一次处理
 * 2.含有异常的代码出现子父类继承关系
 * a.含有异常类的代码出现父类的方法
 * b.含有异常类的代码出现子类的方法
 * <p>
 * finally注意事项：
 * 1.在try语句中，catch和finally尽量不写return，因为永远只会执行finally里的return。
 * 2.如果有finally，这一句永远执行不到.
 */
public class Exception {
    public static void main(String[] args) throws java.lang.Exception {

        show(1);
        show2(1, 2);
        show3(1);

        Throwable t = new Throwable();
        System.out.println(t.getCause());
        System.out.println(t.getMessage());
        System.out.println(t.getStackTrace());
    }


    public static void show(int num) throws IOException {
        /*if (num == 1) {
            //throw new NumberFormatException("标越界了~~~  ");
            throw new NullPointerException("运行时的异常");
        }*/
        if (num == 1) {
            throw new IOException("自定义异常");  //编译时的异常
        }
        if (num == 2) {
            throw new FileNotFoundException("IOEx的子类异常类");
        }
    }

    public static void show2(int num, int b) {
        try {
            if (num == 1) {
                throw new IOException("自定义IO异常1");
            }

            if (b == 1) {
                throw new FileNotFoundException("自定义文本 异常2");
            }

        } catch (FileNotFoundException f) {
            f.printStackTrace();
            System.out.println("解决方案2");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("解决方案1");
        }
    }

    //先执行执行return 1,JVM检测到try语句中含有finally,先执行finally里面的代码,再执行return1语句
    public static int show3(int num) {
        try {
            if (num == 1) {
                throw new IOException("自定义IO异常");
            }
            System.out.println("44444444444444444444");//当num=1时，{}后面的代码执行不到。
            return 0;
        } catch (IOException e) {
            System.out.println("1111111111111111111111");
            return 1;
        } finally {
            num = 3;
            // return 3; //如果finally有return语句,永远返回finally中的结果,避免该情况.
        }
        //return 2;
    }
}