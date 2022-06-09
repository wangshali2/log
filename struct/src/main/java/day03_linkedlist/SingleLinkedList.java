package day03_linkedlist;

/**
 * @Author wsl
 * @Date 2022-04-10-12:58
 * @Description 头节点不能动，需要一个辅助变量
 */
public class SingleLinkedList {

    public HeroNode head = new HeroNode(0, "", "");

    public HeroNode getHead() {
        return head;
    }


    /**
     * 在最后一个节点添加新节点（tmp.next=null）
     *
     * @param newNode
     */
    public void add(HeroNode newNode) {
        HeroNode tmp = head;
        while (true) {
            if (tmp.next == null) {
                break;
            }
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }


    /**
     * 按顺序添加 :tmp->newNode->tmp.next
     *
     * @param newNode
     */
    public void addByOrder(HeroNode newNode) {
        HeroNode tmp = head;
        boolean flag = false;

        //找
        while (true) {
            if (tmp.next == null) {
                break;
            } else if (tmp.next.no > newNode.no) {
                break;
            } else if (tmp.next.no == newNode.no) {
                flag = true;
                break;
            }
            tmp = tmp.next;
        }
        if (flag) {
            System.out.printf("%d 编号已经存在", newNode.no);
        } else {
            newNode.next = tmp.next;
            tmp.next = newNode;
        }
    }

    /**
     * @param newNode
     */
    public void update(HeroNode newNode) {
        if (head.next == null) {
            System.out.println("空");
            return;
        }
        HeroNode tmp = head.next;
        boolean flag = false;

        while (true) {
            if (tmp == null) {
                break;
            }
            if (tmp.no == newNode.no) {
                flag = true;
                break;
            }
            tmp = tmp.next;
        }

        if (flag) {
            tmp.name = newNode.name;
            tmp.nickName = newNode.nickName;
        } else {
            System.out.println("没有找到");
        }
    }

    /**
     * 原:tmp->newNode->tmp.next
     * 现：tmp->tmp.next
     *
     * @param newNode
     */
    public void del(HeroNode newNode) {

        HeroNode tmp = head;
        boolean flag = false;
        while (true) {
            if (tmp.next == null) {
                break;
            }
            if (tmp.next.no == newNode.no) {
                flag = true;
                break;
            }
            tmp = tmp.next;
        }
        if (flag) {
            tmp.next = tmp.next.next;
        } else {
            System.out.println("没有找到");
        }
    }

    /**
     * 遍历所有数据
     */
    public void list() {
        if (head.next == null) {
            System.out.println("空");
            return;
        }
        HeroNode tmp = head.next;
        while (true) {
            if (tmp == null) {
                break;
            }
            System.out.println(tmp);
            tmp = tmp.next;
        }
    }

    /**
     * @param head
     * @return
     */
    public static int getLen(HeroNode head) {
        if (head.next == null) {
            return 0;
        }

        int len = 0;
        HeroNode tmp = head;
        while (tmp.next != null) {
            len++;
            tmp = tmp.next;
        }
        return len;
    }

    public static HeroNode findLastIndexNode(HeroNode head, int index) {
        if (head.next == null) {
            return null;
        }

        int size = getLen(head);
        if (index < 0 || index > size) {
            return null;
        }

        HeroNode tmp = head.next;
        for (int i = 0; i < size - index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public static void reverList(HeroNode head) {
        if (head.next == null || head.next.next == null) {
            return;
        }

        HeroNode cur = head.next;
        HeroNode next = null;
        HeroNode reverHead = new HeroNode(0, "", "");
        while (cur != null) {
            next=cur.next;//3->4 ;4->0
            System.out.println("next----"+next);
            cur.next=reverHead.next; //cur:2->0 ;3->2
            System.out.println("cur----"+cur);
            reverHead.next=cur; //2
            System.out.println("rever---:"+reverHead);

            cur=next; //3->0
        }
        head.next=reverHead.next;
    }
}
