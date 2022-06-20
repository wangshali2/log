package day09.init.demo05;

/**
 * 饿汉式
 */
public class CEO {
    //1.将构造器私有化
    private CEO() {
    }

    //2.在类中创建唯一的对象，用final,static修饰
    private final static CEO ceo = new CEO();

    //3.将唯一的对象进行私有化，对外提供获取对象的方法。
    public static CEO getCeo() {
        return ceo;
    }
}
