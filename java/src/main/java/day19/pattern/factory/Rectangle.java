package day19.pattern.factory;

/**
 * @Author wsl
 * @Description
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("长方形 Inside Rectangle::draw() method.");
    }
}
