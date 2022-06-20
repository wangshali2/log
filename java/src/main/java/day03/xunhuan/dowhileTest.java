package day03.xunhuan;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class dowhileTest {
    public static void main(String[] args) {
        //便利100内的偶数
        int num = 1;
        do {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
        while (num <= 100);



        for (int i = 1; i < 10; i++) {
            if (i == 3) {
                //break;	1  2
                continue;     //  1 2 4 5 6 7  8 9
                //System.out.println(i);	编译错误: 无法访问的语句
            }
            System.out.println(i);

        }
    }
}
