package day05.OOP.demo2;

import java.util.Arrays;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class OOP1 {
    public static void main(String[] args) {
        Student s1 = new Student("甲", 111);
        Student s2 = new Student("乙", 222);
        Student s3 = new Student("丙", 333);

        //id和num属于类的，所以3个对象都相同
        s1.setId(1);
        s2.setNum(300);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //调用并赋值：类名.属性
        Student.id = 2;
        Student.num = 400;


        Student[] arr = {s1, s2, s3};
        System.out.println(Arrays.toString(arr));

    }
}
