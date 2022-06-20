package day03.xunhuan;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class SwitchTest2 {
    public static void main(String[] args) {
        //1.获取生日
        int m = 1;
        int d = 211;

        //2.判断
        switch (m) {
            case 1:
                if (d >= 20 && d <= 30) {
                    System.out.println("水瓶");
                } else if (d > 1 && d < 20) {
                    System.out.println("摩羯");
                } else
                    System.out.println("请输入正确的日期");

                break;

            case 2:
                if (d >= 19) {
                    System.out.println("双鱼");
                } else
                    System.out.println("水瓶");
                break;

            case 3:
                if (d >= 21) {
                    System.out.println("白羊");
                } else
                    System.out.println("双鱼");
                break;
            case 4:
                if (d >= 20) {
                    System.out.println("金牛");
                } else
                    System.out.println("白羊");
                break;
            case 5:
                if (d >= 21) {
                    System.out.println("双子");
                } else
                    System.out.println("金牛");
                break;
            case 6:
                if (d >= 22) {
                    System.out.println("巨蟹");
                } else
                    System.out.println("双子");
                break;
            case 7:
                if (d >= 23) {
                    System.out.println("狮子");
                } else
                    System.out.println("巨蟹");
                break;
            case 8:
                if (d >= 23) {
                    System.out.println("处女");
                } else
                    System.out.println("狮子");
                break;
            case 9:
                if (d >= 23) {
                    System.out.println("天秤");
                } else
                    System.out.println("处女");
                break;
            case 10:
                if (d >= 24) {
                    System.out.println("天蝎");
                } else
                    System.out.println("天秤");
                break;
            case 11:
                if (d >= 23) {
                    System.out.println("射手");
                } else
                    System.out.println("天蝎");
                break;
            case 12:
                if (d >= 22) {
                    System.out.println("魔蝎");
                } else
                    System.out.println("射手");
                break;
            default:
                System.out.println("请输入正确的日期");

        }
    }
}
