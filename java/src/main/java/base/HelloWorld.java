package base;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description  变量
 * @Version 1.0
 */
public class HelloWorld {
    public static void main(String[] args) {
        //字符串常量  用“”表示
        System.out.println("hello world!!!");
        System.out.println(" ");
        //整数常量
        System.out.println(821);
        //浮点型常量
        System.out.println(3.14);
        //布尔常量
        System.out.println(true);
        System.out.println(false);
        //空常量-
        //字符常量-用‘’表示
        System.out.println('a');
        System.out.println('1');
        //System.out.println('10'); 错误
        //System.out.println('');   错误，不可以为空

        System.out.println("-----------------------------------------");

        byte num1 = 12;
        short num2 = 123;
        int num3 = 1234;
        long num4 =	12345678900L;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(010);  //八进制

       // byte d1=num1+2 ; //编译不通过


        float num5=12.34F;
        double num6=56.78;
        System.out.println(num5);
        System.out.println(num6);


        char c0 = 'a';
        char c1 = 97;
        char c2 = 27801; //对应汉字=沙
       // char c3 = '中';
        char c4 = '\n';
        char c5 = '\b';


        System.out.println(c0);
        System.out.println(c1);
        System.out.println(c2);
     //   System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        boolean b1=true;
        System.out.println(b1);

        int c ;
        //System.out.println(c);编译不通过，先声明后调用
        c=4;

        //int a,b=1,2;   编译不通过
        int a=1,b=2;
        System.out.println(a);
        System.out.println(b);


        System.out.println(1 | 2);
        System.out.println(1 & 2);
        System.out.println(Integer.toBinaryString(15));//1111
        System.out.println(Integer.toHexString(15));//f

    }
}
