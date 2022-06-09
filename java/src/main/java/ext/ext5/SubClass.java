package ext.ext5;

public class SubClass extends SuperClass {

    public SubClass() {
        // super(); //写不写没有区别默认调用的是父类无参
        this(1);//要放在首行
       // super(1);
        System.out.println("子类无参");
    }

    public SubClass(int num) {
        System.out.println("子类有参 num:" + num);
    }
}
