package day16.debug;

/**
 * @Author wsl
 * @Date 2022-04-06-11:24
 * @Description
 */
public class DebugDemo {
    public static void main(String[] args) {
        System.out.println("start");
        // line();
        // detail();
        // method();
        // exection();
        gerPerson();
        System.out.println("end");

    }

    public static void line() {
        System.out.println("行断点");
    }

    //shift+左键：详细信息
    public static void detail() {
        System.out.println("详细断点");
    }

    //方法断点：查看一个变量在方法里的变化
    public static void method() {
        System.out.println("方法断点");
        ServiceImp serviceImp = new ServiceImp();
        serviceImp.show();
    }

    //异常断点
    public static void exection() {
        Object o = null;
        o.toString();  //添加nullPoint异常
        System.out.println("异常捕获");
    }

    //属性断点 | 读写跟踪
    public static void gerPerson() {
        Person person = new Person("wsl", 12);
        person.setAge(20);
        System.out.println("属性断点");
    }

}
