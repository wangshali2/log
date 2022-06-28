package day17.generic;

/**
 * @Author wsl
 * @Description 泛型类
 * 2.try-catch中不能声明泛型
 */
class demo3 {

}

//泛型类
class Person<T> {
    // 使用T类型定义变量
    private T info;

    //泛型方法
    public T getInfo() {
        return info;
    }

    //类中带泛型，传参有泛型
    public void setInfo(T info) {
        this.info = info;
    }


    public <T> T setInfo2(T info) {
        T result = info;
        return result;
    }

    public Person() {
    }

    // 使用T类型定义构造器
    public Person(T info) {
        this.info = info;
    }
}