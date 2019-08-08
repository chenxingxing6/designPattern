package behavior_pattern.status;

/**
 * User: lanxinghua
 * Date: 2019/8/8 14:19
 * Desc: 状态抽象类
 */
public abstract class AbstractQQState {
    // 上下文环境
    protected StateContext stateContext;

    public void setStateContext(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    public abstract void method();

}
