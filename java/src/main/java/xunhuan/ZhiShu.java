package xunhuan;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class ZhiShu {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {

            boolean isFlag = true;
            for (int j = 2; j < i; j++) { //除了1和他本身如果还有其余除数  标识的值就改变。
                if (i % j == 0) {
                    isFlag = false;
                    break;//优化1；只要能除尽说明已经不是质数了，后面不需再判断。
                }
            }
            if (isFlag == true) {  //如果isFlag=true没有变过，说明没有经过for循坏的if条件。注意是==，否则输出所有数。
                System.out.println(i);
            }
        }

        System.out.println("=========================================================");


        for (int i = 2; i <= 100; i++) {
            int count = 0; //被除数能被整除的次数计数器
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {  //=2时表明它只被1和他本身整除，所以是质数
                System.out.println(i);
            }
        }
    }
}
