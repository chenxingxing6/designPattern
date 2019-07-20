package create_pattern.factory;

/**
 * User: lanxinghua
 * Date: 2019/7/20 15:22
 * Desc: 短信发送
 */
public class SmsSender implements ISender{
    @Override
    public void send() {
        System.out.println("短信发送");
    }
}
