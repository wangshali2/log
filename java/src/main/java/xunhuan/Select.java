package xunhuan;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class Select {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int num = 4;
        int key = 0;
        for (int i = 0; i < a.length; i++) {
            if (num == a[i]) {
                key = i;
                System.out.println("找到了：" + key);
                break;
            }

        }

        if (key == 0) {
            System.out.println("没找到");
        }
    }
}
