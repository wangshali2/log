package day19.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wsl
 * @Description  zookeeper 通知者
 */
public class Subject {

    //存放观察者们
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    //通知观察者们
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
