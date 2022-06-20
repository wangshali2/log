package day09.init.demo04;
/*
* 包装类型的面试题3:
 * 		1.在常量池中没有浮点数的区域，因此比较的是两个地址值
 * 		2.字符在常量池中有对应的区域
 * 		3.布尔类型在常量池中也有对应的区域
* */
public class BZ03 {
    public static void main(String[] args) {
        Double num01 = 0.0;
        Double num02 = 0.0;
        System.out.println(num01 == num02);//false
        System.out.println(num01.toString());//打印的是内容toString重写过

        System.out.println("================");

        Character num03 = 'a';//97
        Character num04 = 'a';
        System.out.println(num03 == num04);//true  在常量池范围内

        Character num05 = '沙';//27801
        Character num06 = '沙';
        System.out.println(num05 == num06);//false  不在常量池范围内

        System.out.println("================");

        Boolean num07=false;
        Boolean num08=false;
        System.out.println(num07 == num08);

        Boolean num09=true;
        Boolean num10=true;
        System.out.println(num09 == num10);
    }
}
