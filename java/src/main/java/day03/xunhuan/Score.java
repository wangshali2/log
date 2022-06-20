package day03.xunhuan;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class Score {
    public static void main(String[] args) {
        int[] a = new int[]{5, 4, 6, 8, 9, 0, 1, 2, 7, 3};
        int max = 0;
        int min = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            //最大值
            if (a[i] > max) {
                max = a[i];
            }

            //最小值
            if (a[i] < min) {
                min = a[i];
            }

            //和
            sum += a[i];
        }
        System.out.println(max);
        System.out.println(min);


        double r = (sum - min - max) * 1.0 / (a.length - 2);
        System.out.println("平均值：" + r);
    }
}
