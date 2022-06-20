package day08.ext.ext2;

public class SubClass extends SuperClass {

    //实例变量
    int num = 20;

    public void print() {
        //局部变量
        int num = 30;

        System.out.println(num);        //30
        System.out.println(this.num);   //子类的实例变量20
        System.out.println(super.num);  //父类的实例变量10
        System.out.println(this);       //day05.ext2.SubClass@1b6d3586
        //System.out.println(super);    虽然代表变量，但不可直接打印

    }

    public  static void method(){
        System.out.println("子类的静态方法");
    }
}
