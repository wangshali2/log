package ext.ext1;

public class Animal {
    //公共变量
    public String name;
    public int age;
    //私有变量
    private int id;

    public Animal(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Animal() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
