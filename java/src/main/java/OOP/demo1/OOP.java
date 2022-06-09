package OOP.demo1;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 * 匿名对象：当对象只使用唯一的一次时，可以应用匿名对象的形式。
 * 当使用匿名对象时，堆内存和栈内向没有指向，GC把这个对象当成垃圾数据
 */
public class OOP {
    public static void main(String[] args) {

        //通过无参的构造器进行对象的初始化
        //对象的使用  类名 对象名 = new 类名();
        Student s1 = new Student();
        //对象的赋值
        s1.setName("王莎丽");
        s1.setAge(18);
        s1.study();
        System.out.println(s1.getName() + "============" + s1.getAge());

        //通过有参的构造器进行对象的初始化
        Student s2 = new Student("莉莉娅",20);
        s2.study();
        System.out.println(s1.getName() + "============" + s2.getName());


        Phone p = new Phone();
        //对象的属性使用 对象.属性
        p.brand="小米";
        p.price=10000;
        //对象的方法使用 对象.方法
        p.call();
        p.sendMessage();
        p.playGame();

        //匿名对象:没有显示的变量名，只能调用一次
        new Phone().call();
        p.show(new Phone());


        Student a1 = new Student("安小妮", 18);
        Student a2 = new Student("秋小佳", 18);
        Student a3 = new Student("张小芳", 18);
        Student a4 = new Student("张小弛", 18);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(Student.getNum());
    }
}
