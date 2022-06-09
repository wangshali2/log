package xunhuan;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class Tel {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        String tel = "";

        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }

        System.out.println("联系方式：" + tel);



        //格式化打印数组
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        //增加一位数
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        int num=1;
        newArr[newArr.length - 1] = num;
        arr = newArr;
    }
}

