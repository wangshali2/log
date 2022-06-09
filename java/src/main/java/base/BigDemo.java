package base;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author wsl
 * @version 2020091117:00
 * <p>
 * BigInteger:表示比long大的整数
 * BigDecimal:精确的十进制的小数
 */
public class BigDemo {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("1234567891234567890123");
        BigInteger b = new BigInteger("1");


        System.out.println(2.0 - 1.1);//0.89999999
        BigDecimal big = new BigDecimal(2.0);//这种构造器传入的值不准确，不推荐用
        BigDecimal big2 = new BigDecimal(1.1);



        BigDecimal big3 = new BigDecimal("2.0");//String 类的精确
        BigDecimal big4 = new BigDecimal("1.1");

        System.out.println(a.add(b));
        System.out.println(big.subtract(big2));

        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal two = BigDecimal.ZERO;
        zero.add(two);
      
    }
}




















