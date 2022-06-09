package day02_queue;

import java.util.Scanner;

/**
 * @Author wsl
 * @Date 2022-04-07-16:04
 * @Description 环形队列
 */
public class Demo {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(3);
        char key = ' ';

        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头的数据");
            key = scanner.next().charAt(0);

            switch (key) {
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("输入一个数");
                    int num = scanner.nextInt();
                    queue.addQueue(num);
                    break;
                case 'g':
                    int res = queue.getQueue();
                    System.out.printf("取出的数据是%d\n", res);
                    break;
                case 'h':
                    int front = queue.showFront();
                    System.out.printf("取出的数据是%d\n", front);
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
