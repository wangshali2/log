package day08.ext.ext1;

public class Cat extends  Animal{

    public Cat() {
    }

    public Cat(String name, int age, int id) {
        super(name, age, id);
    }

    public void catchM(){
        System.out.println("抓老鼠");
    }
}
