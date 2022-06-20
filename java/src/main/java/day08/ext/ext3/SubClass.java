package day08.ext.ext3;

public class SubClass extends SuperClass {

    //自类自己的不同名方法
    public void method02() {
        System.out.println("子类method02");
    }

    //todo 重写
    @Override
    public void method() {
        System.out.println("子类method");
    }

    public A Over() {
        System.out.println("子类A");
        return null;
    }

   /* @Override
    public B Over() {
        System.out.println("子类B");
        return null;
    }*/

    //BC都是重写方法，over()只能有一个
    /* @Override
     public C Over( ){
         System.out.println("子类C");
         return null;
     }*/


    //todo 重载：同名函数，不同参数（个数/类型）
    @Override
    public void classT(A a) {
        System.out.println("子类classTA");
    }


    public void classT(B a) {
        System.out.println("子类classTB");
    }

    public void classT(B a, B c) {
        System.out.println("子类classTB");
    }

    public void classT(C c) {
        System.out.println("子类classTC");
    }


    public void show() {
        this.method();    //this 子类
        super.method();   //父类

    }
}
