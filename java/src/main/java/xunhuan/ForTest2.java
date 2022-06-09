package xunhuan;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class ForTest2 {

    public static void main(String[] args) {

        //4*6 个*
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        //
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        //99乘法表
        int sum=1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+sum+"\t");
            }
            System.out.println();
        }

    }
}
