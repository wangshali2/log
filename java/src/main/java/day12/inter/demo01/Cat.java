package day12.inter.demo01;

public class Cat extends Animal  {
    @Override
    public void eat() {
        System.out.println("猫类的吃鱼");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }


}
