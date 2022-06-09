package xunhuan;

//5+4+3+2+1=15  递归
public class DiGui {
    public static void main(String args[]) {
        int num = 5;
        System.out.println(getSum(num));
    }

    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + getSum(num - 1);
        }
    }

}