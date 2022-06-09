package base;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class Operator {
    public static void main(String[] args) {

        long num1 = 124L;
        float num2 = 3.14F;

        num2 = num1;
        // num1=num2;         大-->小不行
        num2 = (float) num1;     //强制转换


        char num3 = 'b';
        int num4 = 124;
        // num3=num4;         大-->小不行
        num3 = (char) num4;  //强制转换


        byte num6 = 1;

        float f1 = 3.14F;
        float f2 = 2.56F;
        System.out.println(f1 + f2);

        short s1 = 3;
        short s2 = 4;
        System.out.println(s1 + s2);


        byte b4 = 123;  //默认123是int
        System.out.println(b4);

        char y = 'a';
        char y1 = 97;
        System.out.println(y);
        System.out.println(y1);


        byte a3 = 3;
        byte b3 = 4;
        b3 += a3;  //隐含强转
        // b3=b3+a3; // 不兼容的类型
        System.out.println(b3);

        byte b10 = 3 + 4;//不用强转，自动转换成byte b=7;
        System.out.println(b10);
        System.out.println("----------------------------");

        int a = 3;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);


        System.out.println("----------------------------");
        System.out.println(a + b);
        System.out.println(a > b);      // false
        System.out.println(a < b);      // true


        System.out.println("----------------------------");
        System.out.println("hello" + 5 + 20); //	 hello520
        System.out.println(5 + 20 + "hello"); // 25hello
        System.out.println("" + 'a' + 1);  //a1
        System.out.println('a' + 1);  //98


        int nmu = 9;
        System.out.println(nmu > 5 & nmu < 15); //true
        System.out.println(!!false);    //false
        // System.out.println(5<nmu<15);	  书写错误

        System.out.println(5 & 9);  //1
        System.out.println(5 | 9);  //13
        System.out.println(5 ^ 9);  //12
        System.out.println(~9);  //10

        System.out.println(1&0);  //0
        System.out.println(1&1);  //1
        System.out.println(0&1);  //0
        System.out.println(0&0);  //0
        System.out.println(0|0);  //0
        System.out.println(1|0);  //1
        System.out.println(1<<1);  //num左移1,相当于*2，地位补0
        System.out.println(1<<3);  //num左移3,相当于*8，地位补0
        System.out.println(1<<5);  //num左移5,相当于*32，地位补0


        int qa = 2;
        int qb = ++qa;
        System.out.println(qa);
        System.out.println(qb);

        int a1 = 2;
        int b1 = a++;
        System.out.println(a1);
        System.out.println(b1);

        int a2 = 3;
        int max = a2 > b ? a2 : b;
        System.out.println(max);
    }
}
