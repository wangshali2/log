package day06.poiy.demo2;

public class Animal {

    int age;
    char color;
    int num = 10;

    public Animal(int age, char color) {
        this.age = age;
        this.color = color;
        System.out.println("父类有参构造器");
    }

    public Animal() {
        System.out.println("父类无参构造器");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }


    public void eat(String something) {
        System.out.println("父类的eat");
    }
}
