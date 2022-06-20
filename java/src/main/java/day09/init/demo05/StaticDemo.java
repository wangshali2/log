package day09.init.demo05;

/**
 * 单例模式：
 * 设计模式：解决某一类问题的思路
 * 基础的设计模式23种
 * 框架：半成品项目
 * 单例：单一的实例
 * 单例设计模式：创建唯一的对象的解决思路
 * 步骤：
 * 1.将构造器私有化
 * 2.在类中创建唯一的对象，用final,static修饰
 * 3.将唯一的对象进行私有化，对外提供获取对象的方法。
 */
public class StaticDemo {
    public static void main(String[] args) {

        // CEO ceo = new CEO();//不加static无法获取,私有不能获取，不加final外界可以更改

        // CEO.ceo=null;

        System.out.println(CEO.getCeo());

        System.out.println(CEO2.getCeo());




    }
}


















