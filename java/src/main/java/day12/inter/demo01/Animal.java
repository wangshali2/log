package day12.inter.demo01;

public class Animal implements Interface01 {

    private  String name;
    private  int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    /*@Override
    public void eat() {
        System.out.println("父类的重写方法");
    }*/

    @Override
    public void eat() {

    }


    @Override
    public   void sleep()  {
        System.out.println("父类中每只动物都有的方法是默认方法");
    }
}
