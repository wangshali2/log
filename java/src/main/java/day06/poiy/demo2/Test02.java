package day06.poiy.demo2;

/**
 * 多态的好处：
 * 1.当父类或者父接口作为方法的形参时，只需要传递给其该类型对象或者其子类
 * 2.多态形式数组
 * <p>
 * 多态成员的特点：
 * 1.构造器   和创建对象一样，先初始化父类对象，再初始化子类。
 * 2.实例变量  看变量是什么数据类型即左边-父类  属性不能覆盖，堆中两个值都有
 * 3.实例方法  先看父类（父接口）有没有这个方法，如果有，执行子类重写后的方法，如果没有编译报错
 */
public class Test02 {
    public static void main(String[] args) {

        //父new父
        Animal animal = new Animal();
        System.out.println(animal.num);  //父10
        System.out.println("-----------1-------------");

        //子new子
        Dog dog = new Dog(2, 'C');
        System.out.println(dog.num);    //子30
        System.out.println("-----------2-------------");

        Cat cat = new Cat(3, 'B');
        System.out.println("-----------3-------------");

        //1.不需要给每个子类创建对象
        Animal cat1 = new Cat(2, 'A');
        cat1.eat("猫粮");   //子父类都有，执行子类的方法
        // cat1.catchm() 报错，父类无此方法
        System.out.println("------------4------------");

        Animal dog1 = new Dog(3, 'B');
        System.out.println(dog1.num);   //父10
        dog1.eat("骨头");

        //向下强转  子类类型 对象名 = (子类类型) 对象;
        Dog d = (Dog) dog1;
        if (d instanceof Dog) {

        }

        System.out.println("------------5------------");


        //2.父类作形参时，用子类传递
        Person P = new Person();
        System.out.println("------------7------------");
        P.keepPet(cat1, "骨头");
        P.keepPet(dog1, "鱼");


    }

    public void showA(Animal animal){
        animal.eat("");  //晚期绑定
    }

    public void showA(Huntable huntable){
       huntable.hunt();  //晚期绑定
    }
}
