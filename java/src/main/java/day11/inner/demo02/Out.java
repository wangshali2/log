package day11.inner.demo02;

/**
 * 内部类：在一个类中定义另一种类,根据内部类位置的不同：
 * 1.成员内部类  : 实例内部类 / 静态内部类
 * 2.局部内部类  : 匿名内部类 / 普通的局部内部类
 * <p>
 实例内部类：
 * 1.权限修饰符：
 * 外部类：public 缺省
 * 内部类：4种都可以
 * 2.如何创建内部类对象：外部类类名.内部类类名 对象名=new 外部类类名（）.new 内部类类名（）；
 * <p>
 * 3.外部类成员和内部类成员的关系：
 * 内部类访问外部类：
 * ①内外部同名变量  外部类类名.this.实例变量名或方法名();
 * ②内部类可以访问外部类所有的成员，包括private
 * ③实例内部类不可以定义静态成员：静态随着类的加载而加载，在静态内部类中定义静态成员。
 * 外部类访问内部类：需要在外部类实例方法中创建内部类实例对象
 *
 静态内部类
 *  静态内部类存放静态成员，实例成员可以存放，但是使用的话，需要创建静态内部对象（不推荐）
 *
 *
 内外部成员关系
 *  * 内-外
 *  * 1.在静态内部类静态方法中可以访问外部类的静态成员，不可以直接访问实例成员
 *  *   如果想强行访问，需要常见外部类对象，通过对象名访问
 *  * 3.在静态内部类的静态方法中，不能使用this和super，外部静态成员和内部静态成员同名，使用外部类名.静态变量名
 *
 *
 局部内部类：在方法内部定义的一个类
 * 1.权限修饰符
 *          外部类： public 缺省
 *          内部类：缺省
 * 2.在其他类针对内部类的应用：需要在内部类所在的方法中创建内部类对象，针对对象进行操作
 * 3.外部类和内部类的访问
 * *  外-内
 * *  内外部类同名变量，在内部类的方法中无法访问外部类的局部变量。
 * *  在局部内部类中可以使用所在方法的局部变量，但不可以赋值（JVM自动添加了final类型），内部类对象的生命周期比
 */
public class Out {

    public int num = 10;//外部类的实例变量

    int a = 100;
    static int b = 200;


    //实例内部类
    public class Inner {
        int num = 20;//内部类的实例变量
        //static int c=100;
        final static int NUM = 10;

        public void method() {
            int num = 30;
            System.out.println(num);          //内部类局部变量 30
            System.out.println("内部方法");
            System.out.println(this.num);     //内部类的实例变量 20
            //外部类类名.this.实例变量名或方法名();
            System.out.println(Out.this.num);     //外部类的实例变量10  outer.this代表对象 不是静态的

        }

    }

    //静态内部类
    public static class Inner2 {
        int aa = 40;
        static int bb = 10;
        static int b = 33;
        private static int num = 30;

        public static void method() {
            System.out.println("内部实例方法");
            System.out.println(b);
            System.out.println(Out.b);
            System.out.println(bb);
          //  System.out.println(aa);
        }
    }

    //局部内部类
    public void method(){
        int a=10;
        System.out.println("11111111111111111");
        class Inner{
            public void method(){
                System.out.println("22222222222222222222");
                System.out.println(a);
                //a=20;
            }

        }

        Inner inner = new Inner();
        inner.method();
    }

    public static void main(String[] args) {

        //1.先创建外部类对象
        Out out = new Out();
        Inner inner = out.new Inner();

        //2.外部类类名.内部类类名 对象名=new 外部类类名().new 内部类类名();
        Inner inner1 = new Out().new Inner();
        inner1.method();


        Inner2 inner2 = new Inner2();


    }
}
