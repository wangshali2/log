package day01_arr;

/**
 * @Author wsl
 * @Date 2022-04-06-17:42
 * @Description  二维数组-> 稀疏数组
 */
public class SparseArray {
    public static void main(String[] args) {
        // 创建一个原始的二维数组 11 * 11
        // 0: 表示没有棋子， 1 表示 黑子 2 表蓝子
        int[][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;

        // 输出原始的二维数组
        for (int[] ints : arr) {
            for (int data : ints) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        // 将二维数组 -> 稀疏数组
        // 1. 先遍历二维数组 得到非0数据的个数sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 11; j++) {
                if (arr[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.printf("%d", sum);

        // 2. 创建对应的稀疏数组
        int[][] sparseArr = new int[sum + 1][3];
        // 给稀疏数组赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 11; j++) {
                if (arr[i][j] != 0) {
                    count++;
                    sparseArr[count][0]=i;
                    sparseArr[count][1]=j;
                    sparseArr[count][2] = arr[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("得到稀疏数组为~~~~");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
        }
        System.out.println();


        int[][] arrNew = new int[sparseArr[0][0]][sparseArr[0][1]];

        for (int i = 1; i < sparseArr.length; i++) {
            arrNew[sparseArr[i][0]][sparseArr[i][1]]=sparseArr[i][2];
        }

        for (int[] ints : arrNew) {
            for (int data : ints) {
                System.out.printf("%s\t",data);
            }
            System.out.println();
        }
    }


}
