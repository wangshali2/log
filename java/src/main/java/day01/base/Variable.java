package day01.base;

/*
 */
public class Variable {
    public static void main(String args[]) {

        //当形参传递的变量是基本数据类型时：
        int a = 10, b = 20;
        System.out.println("a1=" + a); //10
        System.out.println("b1=" + b); //20
        Test(a, b);
        System.out.println("a4=" + a);  //10 a,b的值不变
        System.out.println("b4=" + b);  //20

        //当形参传递的变量是引用数据类型时：
        int[] arr = {1, 2, 3};
        System.out.println("0:"+arr[0]);   //1
        System.out.println("1:"+arr[1]);   //2
        System.out.println("2:"+arr[2]);   //3

        Test2(arr);
        System.out.println("a0:"+arr[0]);   //1
        System.out.println("a1:"+arr[1]);   //2
        System.out.println("a2:"+arr[2]);   //3

    }

    public static void Test(int a, int b) {
        System.out.println("a2=" + a);   //10
        System.out.println("b2=" + b);   //20
        a = b;
        b += a;
        System.out.println("a3=" + a);   //20
        System.out.println("b3=" + b);   //40
    }

    public static void Test2(int[] arr) {
        arr = new int[5];
        System.out.println("t0:"+arr[0]);   //0
        System.out.println("t1:"+arr[1]);   //0
        System.out.println("t2:"+arr[2]);   //0

    }

}