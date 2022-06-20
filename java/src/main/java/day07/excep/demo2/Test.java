package day07.excep.demo2;

/**
 * 自定义异常：①自定义运行时异常
 * 位置：java.long.RuntimeException
 * 1.自定义运行时异常，并继承RuntimeException;
 * 2.生成对应的构造器，至少生成2个，一个无参，一个String参数的构造器.
 * <p>
 * ②自定义编译时异常
 * 位置：java.long.Exception除了(RuntimeException)
 * 1.自定义编译时异常，并继承Exception;
 * 2.生成对应的构造器，至少生成2个，一个无参，一个String参数的构造器.
 */
public class Test {
    public static void main(String[] args) {

        // 测试自定义运行异常
        // throw new MyRuntimeException("自定义运行时异常");

        //测试自定义编译异常
        try {
            throw new MyException("自定义编译时异常");
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("解决方案");
        }finally {

        }

        //throw new MyException("123");
    }
}

