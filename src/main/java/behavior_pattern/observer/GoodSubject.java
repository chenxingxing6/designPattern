package behavior_pattern.observer;

/**
 * User: lanxinghua
 * Date: 2019/7/24 14:01
 * Desc:
 */
public class GoodSubject extends Subject {
    private String state;

    public void publish(String newState){
        this.state = newState;
        notifyAllObserve(newState);
    }

    public static void main(String[] args) {
        // 创建被观察对象
        Subject subject = new GoodSubject();
        // 注入观察者
        subject.register(new TaoBaoObserver());
        subject.register(new JingDongObserver());
        // 发布商品
        ((GoodSubject) subject).publish("袜子");
    }
}
