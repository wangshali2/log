package ext.ext2;

public class SuperClass {

    int num = 10;

    //静态变量
    static int id = 10;

    //静态方法
    public static void method() {
        System.out.println("父类的静态方法");
    }

    public void print() {
        System.out.println(num);
    }
}
