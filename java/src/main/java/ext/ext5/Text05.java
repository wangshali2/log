package ext.ext5;

/**构造器
1.父类的构造器无法被子类继承，用super调用时同时加载
2.在对子类进行初始化之前会先初始化父类对象
3.当子类构造器中没有任何super().this(),JVM会自动分配一个无参的super()，默认调父类无参构造器，用来初始化父类的对象
super:
1.初始化子类对象之前先初始化父类对象
2.super(参数)调用父类中对应的构造器用来初始化父类对象

this 和 super不可以同时使用，都要放在方法的第一行
* */
public class Text05 {
    public static void main(String[] args) {

        new SubClass();
        //new SubClass(1);
        System.out.println("==========================");
       // new  SubClass();//父类无参 子类有参 子类无参


    }
}
