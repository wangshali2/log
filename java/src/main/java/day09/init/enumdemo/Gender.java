package day09.init.enumdemo;

/**
 * public enum 枚举类名{
 * 对象名1，对象名2，对象名3...
 * }
 * <p>
 * 有参格式：
 * public enum 枚举类名{
 * 对象名1(实参),对象2(实参),...
 * 私有属性
 * get、set 方法
 * 有参构造器
 * }
 *
 */
public enum Gender {

    //对象
    boy("李雷", 18), girl("韩梅梅", 18), nosex("文本", 12);

    //私有属性
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Gender(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
