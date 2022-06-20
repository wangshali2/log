package day12.inter.demo01;

/**
 * 接口：一组方法和标准（自定义常量）的集合
 * 1.定义程序的标准
 * 2.将现有的javabean再进行拆分--打包放到接口中
 * 3.因为接口中固定成员只有5个，没有构造器，所以不能实例化对象
 * <p>
 * 接口的5个成员：
 * public interface 接口名(){
 *   1.自定义常量；
 *   2.抽象方法；
 *   3.静态方法；（JDK8.0后）
 *   4.默认方法；（JDK8.0后） 子类实现接口就会有这个方法
 *   5.私有方法；（JDK8.09后）
 * }
 *
 * 接口和类的关系：实现关系，多实现
 */
public class Test {

    public static void main(String[] args) {

        //new Interface01()不能实例化对象，调用直接通过接口名.属性
        System.out.println(Interface01.NUM);

        //Interface01.NUM=10;不能重新赋值

        Cat cat = new Cat("tom", 2);
        cat.eat();

        //子类同时继承父类和实现父接口，父类和父接口出现了同名的方法 sleep（），调用子类的方法优先执行父类的方法，而不是父接口的。
        cat.sleep();

        Dog dog = new Dog("jee", 10);
        dog.eat();
        dog.sleep();

        //接口中的静态方法不可以通过实现类名进行调用，只能通过接口名调用
        System.out.println( Interface01.getNum());

    }
}































