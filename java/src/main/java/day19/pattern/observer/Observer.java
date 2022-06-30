package day19.pattern.observer;

/**
 * @Author wsl
 * @Description  抽象观察者
 */
public abstract class Observer {

    protected Subject subject;  //通知者的连接对象

    public abstract void update();  //更新关心的数据的方法
}
