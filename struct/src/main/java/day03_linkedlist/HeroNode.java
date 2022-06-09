package day03_linkedlist;

/**
 * @Author wsl
 * @Date 2022-04-10-12:59
 * @Description
 */
public class HeroNode {
    public  int no;
    public  String name;
    public  String nickName;
    public HeroNode next;

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", next=" + next +
                '}';
    }
}