package base;

/**
 * 静态方法的注意事项:
 * 1.静态方法是随着类的加载而加载,随着类的消亡而消失,而且只加载唯一的一次
 * 2.在静态方法中,不能使用this关键字和super关键字
 * 静态方法加载的时机:字节码文件进入方法区的时候
 * this:就是对象,对象在堆内存
 * 3.在静态方法里面不能调用非静态成员
 * <p>
 * 静态方法,实例方法
 * <p>
 * 实例方法里面  调用  实例方法	正确
 * 实例方法里面  调用  静态方法	正确
 * 静态方法里面  调用  静态方法	正确
 * 静态方法里面  调用  实例方法	错误
 */
public class StaticDemo {
    static int count = 0;

    public static void main(String[] args) {

    }

    public void method01() {
        method02();
    }

    public void method02() {
        method03();
    }

    public static void method03() {
        method04();
    }

    public static void method04() {
      //  method01();报错
    }

    public static void method05() {
        count++;
    }


}
