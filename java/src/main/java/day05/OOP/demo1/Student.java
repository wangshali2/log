package day05.OOP.demo1;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class Student {
    //属性：实例变量
    private String name;
    private int age;
    private int id;
    private static int num = 200821001;

    //无参构造器：修饰符 类名(){}
    public Student() {
        System.out.println("学生类的无参构造器");
    }


    public Student(String name, int age) {
        System.out.println("学生类的有参构造器");
        this.name = name;
        this.age = age;
        this.id = num++;
    }

    public static int getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //行为：实例方法
    public void study() {

        //在同一个方法中不可以创建同名变量
        //在同一个作用域不可以创建同名变量或方法。
        int age = 20;//局部变量
        System.out.println(age + "岁的" + name + "在学习"); //就近原则 20  20

        System.out.println(this.age + "岁的" + name + "在学习");  //18   10
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

