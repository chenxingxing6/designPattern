package create_pattern.factory;

/**
 * User: lanxinghua
 * Date: 2019/7/20 15:21
 * Desc: 邮件发送
 */
public class MailSender implements ISender
{
    @Override
    public void send() {
        System.out.println("邮件发送");
    }
}
