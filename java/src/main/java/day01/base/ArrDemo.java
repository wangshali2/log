package day01.base;

/**
 * @author wsl
 * @version 2022-04-16-21:22
 */
public class ArrDemo {
    public static void main(String[] args) {
        //声明时不能指定长度
        //int a[5]非法
        int i[];
        int[] i1;
        double b[];
        String[] s; //引用类型变量数组

        //静态初始化:在定义数组的同时就为数组元素分配空间并赋值
        int[] arr2 = {2, 3, 4};
        int arr3[] = new int[]{2, 3, 4};

        String names2[] = {"wsl", "mlf"};

        //动态初始化:数组声明且为数组元素分配空间与赋值的操作分开进行
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 2;
        arr[2] = 5;

        String names[];
        names = new String[3];
        names[0] = "lxl";
        names[1] = "mlf";
        names[2] = "wsl";

    }
}
