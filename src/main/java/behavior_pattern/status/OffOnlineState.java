package behavior_pattern.status;

/**
 * User: lanxinghua
 * Date: 2019/8/8 14:27
 * Desc: 离线
 */
public class OffOnlineState extends AbstractQQState {

    @Override
    public void method() {
        System.out.println("QQ离线");
    }
}
