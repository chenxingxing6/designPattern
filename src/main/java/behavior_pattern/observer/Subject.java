package behavior_pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * User: lanxinghua
 * Date: 2019/7/24 13:41
 * Desc:
 */
public abstract class Subject {
    // 保存注册的观察者对象
    private List<Observer> observers = new ArrayList<Observer>();

    /* 登记*/
    public void register(Observer observer){
        observers.add(observer);
    }

    /* 注销*/
    public void unreginster(Observer observer){
        observers.remove(observer);
    }

    /* 通知所有观察者*/
    public void notifyAllObserve(String newState){
        observers.forEach(r -> {
            r.update(newState);
        });
    }

}
