package behavior_pattern.status;

/**
 * User: lanxinghua
 * Date: 2019/8/8 15:03
 * Desc: 上下文
 */
public class StateContext {
    private AbstractQQState state;

    public AbstractQQState getState() {
        return state;
    }

    public void setState(AbstractQQState state) {
        this.state = state;
    }

    public void method(){
        state.method();
    }
}
