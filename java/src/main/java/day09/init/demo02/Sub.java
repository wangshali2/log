package day09.init.demo02;

/**
 执行过程：
 1.在推中开辟两个空间，
 2.子父类赋默认值
 3.通过子类构造器中super调用父类构造器
 4.调用子类重写父类方法
 5.显示初始化
 *
 */
public class Sub extends SuperClass{

    int num=method();
    int a = 3;

    @Override
    public void print() {
        System.out.println(a);//此时a还没有初始化呢，只是完成1.2步
    }

    public Sub() {

        super();
        System.out.println("子类的无参构造器");
        System.out.println(a);//3
    }

    {
        System.out.println("构造器代码块");
        // int num=method();
    }

    public int method() {

        System.out.println("子类实例变量的显示初始化");
        return 10;
    }
}
