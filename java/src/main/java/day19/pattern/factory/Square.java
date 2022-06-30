package day19.pattern.factory;

/**
 * @Author wsl
 * @Description
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("正方形  Inside Square::draw() method.");
    }
}
