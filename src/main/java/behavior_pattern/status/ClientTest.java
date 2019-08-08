package behavior_pattern.status;

/**
 * User: lanxinghua
 * Date: 2019/8/8 14:33
 * Desc:
 */
public class ClientTest {
    public static void main(String[] args) {
        // 创建状态上下文
        StateContext context = new StateContext();
        // 设置状态
        context.setState(new OnlineState());
        context.method();

        context.setState(new OffOnlineState());
        context.method();

    }
}
