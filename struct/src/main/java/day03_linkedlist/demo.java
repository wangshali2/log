package day03_linkedlist;

import static day03_linkedlist.SingleLinkedList.getLen;
import static day03_linkedlist.SingleLinkedList.reverList;

/**
 * @Author wsl
 * @Date 2022-04-10-13:09
 * @Description
 */
public class demo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        SingleLinkedList single = new SingleLinkedList();
//        single.add(hero1);
//        single.add(hero2);
//        single.add(hero3);
//        single.add(hero4);

        single.addByOrder(hero1);
        single.addByOrder(hero4);
        single.addByOrder(hero3);
        single.addByOrder(hero2);
        single.list();

        HeroNode hero5 = new HeroNode(1,"wsl","美女");

        single.update(hero5);
        single.list();
        single.del(hero5);
        single.list();
        System.out.println("-------------");
        System.out.println(getLen(single.getHead()));

        reverList(single.getHead());
        single.list();

    }
}
