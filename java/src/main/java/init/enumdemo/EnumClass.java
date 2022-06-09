package init.enumdemo;


public class EnumClass {

    private EnumClass() {
    }


    private static final EnumClass boy = new EnumClass();
    private static final EnumClass girl = new EnumClass();

    public static EnumClass getBoy() {
        return boy;
    }

    public static EnumClass getGirl() {
        return girl;
    }
}
