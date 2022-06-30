package day19.pattern.proxy;

/**
 * @Author wsl
 * @Description 创建具有现有想要访问对象的对象，为想要访问的对象提供一种代理，从而控制对这个对象的访问。
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();

        // 图像不需要从磁盘加载
        image.display();
    }
}
