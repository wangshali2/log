package day09.init.demo05;

/**
 * 懒汉式
 * 步骤：
 * 1.将构造器私有化
 * 2.在类中定义唯一的对象，什么时候使用对象，什么时候创建对象,用static修饰
 * 3.将唯一的对象进行私有化，对外提供获取对象的方法
 */
public class CEO2 {

    //1.将构造器私有化
    private CEO2() {
    }

    //2.在类中定义唯一的对象,用static修饰，(什么时候使用对象，什么时候创建对象)
    private static CEO2 ceo;

    //3.将唯一的对象进行私有化，对外提供获取对象的方法
    public static CEO2 getCeo() {

        if (ceo == null) {
            ceo = new CEO2();
        }
        return ceo;
    }
}
