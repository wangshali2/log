package day19.pattern.builder;

/**
 * @Author wsl
 * @Description 表示食物条目接口
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
