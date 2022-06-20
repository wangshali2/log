package day08.ext.ext3;

/**
 * 重写：非私有化的实例方法
 * <p>
 * <p>
 * 注解：针对现有的语法规则进行相应的语法检修或者其他功能。
 * 检查方法是否符合重写规则
 * 格式：写在子类重写的方法上。
 *
 * @Override 修饰符  返回值类型 方法名（）{}
 *
 * 面试题：在多态的思想下使用toString().先看父类集合collection中有没有这个方法，其实没有，但编译没有报错。
 *  * 答：在java中所有的接口都会实现Object类的接口形式
 */
public class Test03 {
    public static void main(String[] args) {

        SubClass sc = new SubClass();
        sc.method1();   //父类的实例方法
        sc.method();    //父类的重写方法
        sc.method02();  //子类的实例方法

        sc.show();
        System.out.println("------------------");

        sc.Over();
        System.out.println("------------------");

        sc.classT(new C());//子类
        sc.classT(new B());//子类

        A a = new B();
        a.toString();


    }

}
