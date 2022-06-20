package day05.OOP.demo2;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class StaticA {
    static int id;
    static int age;
    private int num;

    public StaticA(int num) {
        this.num = num;
    }

    public StaticA() {
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        StaticA.id = id;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        StaticA.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
