package day08.ext.ext3;

/**
 * @Author wsl
 * @Date 2021-08-11
 * @Description
 * @Version 1.0
 */
public class SuperClass {

    public void method1() {
        System.out.println("父类method1");
    }

    public void method() {
        System.out.println("父类method");
    }

    public A Over() {
        System.out.println("父类A");
        return null;
    }

    public void classT(A a) {
        System.out.println("父类classTA");
    }
}
