package day06.poiy.demo2;


public class Dog extends Animal implements Huntable {

    int num = 30;

    public void look() {
        System.out.println("看家");
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的颜色的小狗，正在吃" + something);
    }

    public Dog(int age, char color) {
        super();   //父类无参
    }

    public Dog() {
    }

    @Override
    public void hunt() {
        System.out.println("狗子");
    }
}
