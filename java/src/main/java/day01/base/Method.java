package day01.base;


public class Method {

    public static void main(String args[]) {
        //1.单独用，不输出结果
        getSum(1, 6);

        //2.输出调用
        System.out.println(getSum(1, 6));

        //3.赋值调用
        int sum = getSum(1, 6);
        System.out.println(sum);

        compare(2, 3); // 不输出
        boolean bool = compare(5, 5);
        System.out.println("调用方法compare(),比较结果：" + bool);


        int sum4 = getSum1(3.14, 1, 2, 3, 4);
        System.out.println(sum4);

        pritHw2(6);
       // System.out.println(pritHw2(6));   //编译报错，此处不允许使用 '空' 类型。
    }

    //方法1.求和
    public static int getSum(int a, int b) {
        int c = a + b;
        return c;
    }

    //方法2.比较是否相等
    public static boolean compare(int a, int b) {

        return a == b ? true : false;
    }

    //方法3.计算1+2+3...+100的和
    public static int getSum() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    //方法4.可变参数
    //修饰符 返回值类型 方法名(参数类型...形参名){ }
    public static int getSum1(double b, int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = (int) b + arr[i];
        }
        return sum;
    }

    //修饰符 返回值类型 方法名(参数类型[] 形参名){ }
    public static int getSum2(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //方法6.实现不定次数打印
    public static void pritHw2(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println("H");
        }
    }

    public static void QQQ(int a, int b) {
    }

    //编译报错public static void QQQ(int b,int a){}
    public static void QQQ(int a, short b) {
    }

    public static void QQQ(short b, int a) {
    }

    public static void QQQ(short b, int a, int c) {
    }
}