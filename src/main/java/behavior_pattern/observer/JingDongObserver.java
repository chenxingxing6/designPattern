package behavior_pattern.observer;

import cn.hutool.core.lang.Console;

/**
 * User: lanxinghua
 * Date: 2019/7/24 13:45
 * Desc:
 */
public class JingDongObserver implements Observer {

    // 观察者状态
    private String observerState;

    @Override
    public void update(String newState) {
        this.observerState = newState;
        Console.log("接收到消息，发布到京东商城" + newState);
    }
}
