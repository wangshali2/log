package day18.enum_anno;


/**
 * 特点：
 * 1.枚举类中如果没有任何构造器话，JVM自动提供一个默认无参私有构造器;在枚举类中可以创建构造器，默认是private;
 * 2.对象默认的修饰符是：public static final,也就是对象为常量，所以建议大写
 * 3.创建对象的语句，必须放在类体中的第一句
 * 4.如果通过无参构造器创建对象，则参数列表也可以省
 * 5.枚举类不可以显式的通过extends ，继承其他类，因为已经默认继承了Enum;也不可以被其他类继承
 * 6.可以实现接口
 */
public class Test {
    public static void main(String[] args) {

        System.out.println(EnumClass.getBoy());
        System.out.println(EnumClass.getGirl());

        Gender.girl.setName("wsl");
        System.out.println(Gender.girl.getName());
        System.out.println(Gender.nosex);
        System.out.println(Gender.boy);
    }
}
