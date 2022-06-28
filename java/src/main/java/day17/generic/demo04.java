package day17.generic;

/**
 * @Author wsl
 * @Description
 */
public class demo04 {
    public static void main(String[] args) {

        test(new People());
        test(new Man());
       // test(new Creature());
    }

    public static <T extends People> void test(T t){
        System.out.println(t);
    }

}

class Creature{}
class People extends Creature{}
class Man extends People{}
