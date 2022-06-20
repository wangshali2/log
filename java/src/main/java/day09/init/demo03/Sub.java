package day09.init.demo03;

/**
 * @Author wsl
 * @Date 2021-08-11
 * @Description
 * @Version 1.0
 */
public class Sub extends Super {

     Sub() {
        super(); // 隐藏了，多态形式调用方法首先看父类有没有，没有报错，有则执行子类重写的方法
        //super.method(70);
    }

    public void method(int j){
        System.out.println("sub : " + j);
    }
}
