package day08.ext.ext1;

public class Dag extends Animal {

    public Dag() {
    }

    public Dag(String name, int age, int id) {
        super(name, age, id);
    }

    public void lookHome(){
        System.out.println("看家");
    }
}
