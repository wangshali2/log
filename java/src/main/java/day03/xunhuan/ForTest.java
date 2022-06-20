package day03.xunhuan;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class ForTest {
    public static void main(String[] args) {
        //1.打印5遍
        for (int i = 1; i <= 5; i++) {      //i只在for循环内有效，可以调用。

            System.out.println("hello world");
        }
        System.out.println("=====1.打印5遍hello word========");


        //2.遍历1-100中的偶数 ，输出偶数的总和，输出偶数的个数
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println(sum); //注意位置要在for循坏外。
        System.out.println(count);
        System.out.println("========2.遍历1-100中的偶数================");

        //2.2优化
        sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("========2.2遍历1-100中的偶数================");


        //3.打印1-5,并求其之和
        int sum1 = 0;
        for (int i = 1; i <= 5; i++) {
            sum1 += i;
        }
        System.out.println(sum1);
        System.out.println("=======3.打印1-5,并求其之和==========");

        //4.打印1-5
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("======4.打印1-5=============");


        //5.遍历1-100中的奇数 ，输出奇数的总和，输出奇数的个数
        int sum2 = 0;
        int count2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum2 += i;
                count2++;
            }
        }
        System.out.println(sum2);
        System.out.println(count2);
        System.out.println("====5.遍历1-100中的奇数===========");

        //6.打印所有的水仙花数
        int count3 = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i / 1 % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (i == (ge * ge * ge) + (shi * shi * shi) + (bai * bai * bai)) {
                System.out.println(i);
                count3++;
            }
        }
        System.out.println(+count3);
        System.out.println("====6.打印所有的水仙花数===========");


  /*7.(1)打印出四位数字的个位+百位=十位+千位并且个位数为偶数，千位数为奇数的数字,并打印符合条件的数字的个数
      (2)符合条件的数字,每行显示5个,用空格隔开,打印格式如下:
         */
        int num = 0;
        for (int i = 1000; i <= 9999; i++) {
            int ge1 = i % 10;
            int shi1 = i / 10 % 10;
            int bai1 = i / 100 % 10;
            int qian = i / 1000 % 10;

            if ((ge1 + bai1 == shi1 + qian) && (ge1 % 2 == 0) && qian % 2 != 0) {

                num++;
                if (num % 5 == 0) {
                    System.out.println(i);
                } else
                    System.out.print(i + " \t");
            }
        }
        System.out.println(num);


    }
}
