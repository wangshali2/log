package xunhuan;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class YH {
    public static void main(String[] args) {
        //1.声明数组，动态初始化
        int[][] yanghui = new int[10][];

        //2.给数组元素赋值；第几行有几个元素
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];

            //2.1给每行首末元素赋值
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
            //2.2给每行其他元素赋值
            //if (i>1) {
            for (int j = 1; j < yanghui[i].length - 1; j++) {
                yanghui[i][j] = yanghui[i - 1][j] + yanghui[i - 1][j - 1];
            }
            //}
        }
        //3.遍历数组,先大框架输出都是0
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + " ");

            }
            System.out.println();
        }

    }
}
