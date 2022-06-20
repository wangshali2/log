package day06.poiy.demo2;



public class Cat extends Animal implements Huntable{

    int num = 20;

    public void catchm(){
        System.out.println("抓老鼠");
    }

    @Override
    public void eat(String something) {
        super.eat("");
        System.out.println(getAge()+"岁的"+getColor()+"的颜色的小猫，正在吃"+something);

    }

    public Cat(int age, char color) {
        super(age, color);    //父类有参
        System.out.println("子类有参构造器");
    }

    public Cat() {
        super();  //早起绑定
        System.out.println("子类无参构造器");
    }

    public Cat(String name) {
        this();  //早起绑定
    }

    @Override
    public void hunt() {
        System.out.println("猫咪");
    }
}
