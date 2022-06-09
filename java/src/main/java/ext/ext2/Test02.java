package ext.ext2;
/**
 * 非私有化的实例变量；
this:子类的实例方法中
     1.用来区本类同名的实例变量和局部变量；
     2.哪个对象调用了this关键字所在的实例方法，this代表哪个对象
super：
     1.用来区分子父类继承关系中同名的实例变量
     2.哪个对象调用了super关键字所在的实例方法，super代表哪个对象的父亲

 静态成员
 * 1.子类可以继承父类中的静态成员，不建议直接通过对象名访问，用类名.静态成员名访问
 * 2.静态方法可被子类重写
 *
 *
 * */
public class Test02 {
    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.print();

        SuperClass.method();  //父类的静态方法
        SuperClass.id=20;

        SubClass.method(); //子类的静态方法
    }
}
