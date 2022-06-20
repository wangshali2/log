package day11.inner.demo01;
/**
* 1.简化使用接口的步骤  去掉实现类
* 2.匿名内部类是学习Lambda表达式的前提条件
*
* 匿名对象：只能使用唯一的一次
* 匿名内部类： 如果接口只有唯一的实现类，这个过程可以用匿名内部类进行简化。
*
*
* */
public class Test01 {
    public static void main(String[] args) {

        B b = new B();
        b.method1();
        b.method2();

        System.out.println("----------------");

        //接口 接口名=new 接口(){实现类的类体，其实就是重写接口方法}
        A a = new A() {
            @Override
            public void method1() {
                System.out.println("method3");
            }

            @Override
            public void method2() {
                System.out.println("method4");
            }
        };

       a.method1();
       a.method2();
    }
}
