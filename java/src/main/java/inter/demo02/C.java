package inter.demo02;

/**
 * @Author wsl
 * @Date 2021-08-11
 * @Description
 * @Version 1.0
 *
 * public class 实现类类名 extends 父类类名 implements 接口1，接口2...
 *
 * 当一个类同时实现多个接口，多个接口有同名的默认方法，作为实现类需要重写方法,
 * 如果想在实现类中调用父类接口的默认方法  接口.super.默认方法名（）
 */
public class C implements A,B{

    @Override
    public void method() {
        A.super.method();
        B.super.method();
        //method();编译不报错，运行不通过
    }
}
