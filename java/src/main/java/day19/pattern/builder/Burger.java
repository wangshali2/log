package day19.pattern.builder;

/**
 * @Author wsl
 * @Description
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
