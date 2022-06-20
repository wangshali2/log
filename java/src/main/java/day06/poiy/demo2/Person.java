package day06.poiy.demo2;


public class Person {

    String name;
    int age;

    /* public void keepPet(Dog d,String something){
         d.eat(something);
     }
     public void keepPet(Cat c,String something){
         c.eat(something);
     }*/

    //多态：父类或者父接口作为方法的形参
    public void keepPet(Animal c, String something) {
        c.eat(something);
    }

    public Person() {
    }

    public Person(String name, int age) {
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
}
