package OOP.demo1;

/**
 * @Author wsl
 * @Date 2021-08-10
 * @Description
 * @Version 1.0
 */
public class Phone {
    String brand;
    int price;

    public void call() {
        System.out.println("正在使用" + price + "元的" + brand + "品牌的手机打电话");
    }

    public void sendMessage() {
        System.out.println("正在使用" + price + "元的" + brand + "品牌的手机发短信");
    }

    public void playGame() {
        System.out.println("正在使用" + price + "元的" + brand + "品牌的手机玩游戏");
    }

    public  void show(Phone p){
        System.out.println("aha");
    }
}
