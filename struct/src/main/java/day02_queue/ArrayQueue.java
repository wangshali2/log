package day02_queue;

/**
 * @Author wsl
 * @Date 2022-04-07-15:53
 * @Description
 */
public class ArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[maxSize];
    }

    //判空
    public boolean isEmpty() {
        return rear == front;
    }

    //判满
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    //出队
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("空队列");
        }
        front++;
        return arr[front];
    }

    //入队
    public void addQueue(int n) {
        if (isFull()) {
            throw new RuntimeException("空队列");
        }
        rear++;
        arr[rear] = n;
    }

    //遍历
    public void showQueue() {
        if (!isEmpty()) {
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("arr[%d]=%d\n", i, arr[i]);
            }
        }
    }

    //front
    public int showFront() {
        if (!isEmpty()) {
            return arr[front + 1];
        }
        return 0;
    }
}
