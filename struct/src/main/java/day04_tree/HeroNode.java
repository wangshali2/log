package day04_tree;

/**
 * @author wsl
 * @version 2022-05-20-12:11 树的节点
 */
public class HeroNode {
    private int no;
    private HeroNode left;
    private HeroNode right;

    public HeroNode(int no) {
        this.no = no;

    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
