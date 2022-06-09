package inter.demo01;

/**
 * 接口实现格式：public interface 接口名{}
 */
public interface Interface01 {

    //1.常量 ：[public] [static] [final] 数据类型 常量名=初始化值；
    public final int NUM = 10;

    // 2.抽象方法：[public] [abstract] 返回值类型 方法名();
    public abstract void eat();


    //3.默认方法格式： [public] default 返回值类型 方法名(){ }
    public  default  void sleep()  {
        System.out.println("父接口中每只动物都有的方法是默认方法");
    }

    //4。静态方法
    public static int getNum() {
        return Animal.NUM;
    }

    public static void show(){}
}
