package ext.ext1;
/**
 * 继承
      修饰符  class 父类类名{ }
      修饰符  class 子类类名 extends 父类类名{ }

 * 1.描述的是类与类之间的关系；
 *   一个类可以有多个间接父类，但只有一个直接父类
 *   一个父类可以拥有多个字类
 * 2.只支持单继承   错误：C extends MyAr extends B；
 * 3.支持间接继承  正确：C extends B ;B extends MyAr;
 *
 * Object类：
 * 1. 是所有类的父类 所有对象（包括数组）都实现这个类的方法
 * 2，java.lang.Object
 * 3. public String toString()返回该对象的字符串表示打印对象名或数组名默认就是调用自己的toString

 * */

public class Test01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.age=10;
        cat.name="小猫";
        System.out.println(cat.age);
        System.out.println(cat.name);
       // System.out.println(cat.id);

        cat.catchM();

        Dag dag = new Dag();
        dag.age=12;
        dag.name="小狗";
        System.out.println(dag.age);
        System.out.println(dag.name);

        dag.lookHome();

        Animal animal = new Animal();
        System.out.println(animal.name);  //公有成员
       // System.out.println(animal.id);  //不能访问父类的私有成员


    }
}
