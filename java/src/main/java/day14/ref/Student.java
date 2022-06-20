package day14.ref;

/**
 * @author wsl
 * @version 2020-09-21
 */
public class Student {

    private int age;
    private String name;
    public int id;
    String address;

    public Student(int age, String name, int id, String address) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private Student(int age) {
        this.age = age;
    }

    public Student(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void show (int a, String b , double c) {
        System.out.println("自定义方法");
    }
}
