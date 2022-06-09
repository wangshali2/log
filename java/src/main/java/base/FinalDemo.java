package base;

/**
 * final：最终的，不可改变的
 * 1.局部变量   ：  final 变量类型 变量名=初始化常量      规范：所有字母大写，单词用_连接
 * 2.实例变量   ：  如果是先定义后赋值，赋值需要在所有的构造器进行初始化赋值
 * 3.静态变量   ：  如果是先定义后赋值，赋值需要在该类的静态代码块进行初始化赋值
 */
public class FinalDemo {


    //final 变量类型 变量名=初始化常量
    final int score = 10;

    final int NUM;//先定义后在所有构造器赋值
    int age;
    static final int count;//先定义,不能在构造器里赋值了
    final static int id;

    static {
        id = 3;
    }//静态代码块

    static {
        count = 2;
    }//静态代码块

    public FinalDemo(int num) {
        this.NUM = num;
    }

    public FinalDemo() {
        NUM = 10;
    }

    public FinalDemo(int num, int age) {
        this.NUM = num;
        this.age = age;
    }

    public void method() {
        System.out.println("" + NUM);
    }

}
