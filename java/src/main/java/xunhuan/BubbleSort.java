package xunhuan;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {4, 3, 8, 5, 0, 9, 1, 6,};
        //增强for
        for (int i : arr) {
            System.out.println(i);
        }

        //普通for
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //冒泡
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }



    }
}

