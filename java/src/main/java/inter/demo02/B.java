package inter.demo02;

public interface B {
     default void method() {
        System.out.println("B接口中的默认方法");
    }
}
