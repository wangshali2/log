package xunhuan;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class SwitchTest1 {
    public static void main(String[] args) {
        //1.获取年月日
        //2.月份天数=月份-1
        //3.天数
        int y = 2020;
        int m = 8;
        int d = 25;


        int sum = 0;
        switch (m) {

            case 12:
                sum += 30;
            case 11:
                sum += 31;
            case 10:
                sum += 30;
            case 9:
                sum += 31;
            case 8:
                sum += 31;
            case 7:
                sum += 30;
            case 6:
                sum += 31;
            case 5:
                sum += 30;
            case 4:
                sum += 31;
            case 3:
                if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                    sum += 29;
                } else
                    sum += 28;

            case 2:
                sum += 31;
            case 1:
                sum = sum + d;
                break;

        }
        System.out.println(sum);

    }
}
