package day09.init.demo01;

/**
 * 对象初始化过程：
 * 执行顺序-1-2-3
 * 1.构造代码块中的代码（1和2直接显示初始化优先级一样，谁在前谁先被初始化）
 * 2.实例变量的显示初始化(懒汉式)
 * 3.构造器中的代码
 * <p>
 * <p>
 * 代码块：存放代码的一块区域
 * ①
 * 构造代码块：类中方法外
 * 作用：可以创建对象时给对象的属性初始化.当一个类存在多个构造器，且多个构造器含有相同的代码，可以将这些代码放到代码块.
 * 特点：构造代码块随着对象的加载而执行，每创建一个对象就执行一次;如果构造器中含有this(),先执行this()
 * ②
 * 静态代码块
 * 作用：初始化类的信息
 * 特点：静态代码块随着类的加载而执行，只执行一次
 */

public class Sub {

    static int num1 = show();
    int num2 = method();

    static {
        num1 = 3;
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("1.子类的构造代码块");
    }

    public Sub() {
        //隐藏了许多初始化细节
        //先调用了本类中构造代码块
        this(1);

        System.out.println("2.子类无参构造器");
    }

    public Sub(int num) {
        System.out.println("3.子类有参构造器");
        System.out.println(num);
    }

    private static int show() {
        System.out.println("4.子类的静态变量显示初始化");
        return 0;
    }

    private int method() {
        System.out.println("5.子类的实例变量显示初始化");
        return 0;
    }

}
