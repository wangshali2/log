package day01.base;

/**
 * @Author wsl
 * @Date 2021-10-14
 * @Description
 * @Version 1.0
 *
 * 默认情况下：count=11402
 * 设置栈大小：-Xss256k
 * edit configuration
 */
public class StarkError {
    private static int  a=1;

    public static void main(String[] args) {
        // main(args);  递归，报StackOverflowError  栈溢出

        System.out.println(a);
        a++;
        main(args);

    }
}
