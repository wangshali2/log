package base;

/**
 * @Author wsl
 * @Date 2021-11-15
 * @Description
 * @Version 1.0
 */
public class SinglyListNode {


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);   //链表变为1-> 2-> 3
        linkedList.get(1);            //返回2
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        linkedList.get(1);            //返回3

        System.out.println(linkedList);
    }
}
