package day09.init.demo02;

public abstract class SuperClass {

    //父类的抽象方法
    public abstract void print();

    public SuperClass() {
        //有一步隐含的多态，在父类中使用子类对象this，在父类找是否有相同的方法，有则调用子类的，没有报错.
        this.print();//调用子类的print(),   this是子类 是默认子类构造器中的super()调用了
        System.out.println(this);

    }
}
