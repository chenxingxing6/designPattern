package behavior_pattern.status;

/**
 * User: lanxinghua
 * Date: 2019/8/8 14:27
 * Desc: 在线
 */
public class OnlineState extends AbstractQQState {

    @Override
    public void method() {
        System.out.println("QQ在线");
    }
}
