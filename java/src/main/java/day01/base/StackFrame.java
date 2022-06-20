package day01.base;

/**
 * @Author wsl
 * @Date 2021-10-14
 * @Description
 * @Version 1.0
 */
public class StackFrame {
    public static void main(String[] args) {


        try {
            StackFrame stackFrame = new StackFrame();
            stackFrame.method1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("main正常结束");
    }

    public void method1() {
        System.out.println("method1开始");
        method2();
        System.out.println("method1结束");
        System.out.println(10 / 0);

    }

    public void method2() {
        System.out.println("method2开始");
        method3();
        System.out.println("method2结束");
    }

    public static void method3() {
        System.out.println("method3开始");
        System.out.println("method3结束");

        int a;  //布局变量要显示赋值
        // System.out.println(a);
        System.out.println(b);  //成员变量不用
    }

    public static int b;

}
