package OOP.demo2;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 * <p>
 * static 关键字：
 * 作用：当变量的值
 * 它可以用来修饰变量和方法，被修饰的成员是属于类的，而不是单单是属于某个对象的无构造器，不需要通过创建对象来调用，
 * static在内存中只加载一次，
 */
public class Student {

    private String name;
    private int age;
    static int id;
    static int num=200;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        num++;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Student.num = num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +'\'' +
                ", age=" + age +'\'' +
                ", num=" + num +'\'' +
                '}';
    }

}
