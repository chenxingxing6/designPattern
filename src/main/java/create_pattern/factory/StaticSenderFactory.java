package create_pattern.factory;

/**
 * User: lanxinghua
 * Date: 2019/7/20 15:49
 * Desc: 静态工厂模式
 */
public class StaticSenderFactory {
    public static ISender senderMail(){
        return new MailSender();
    }

    public static ISender senderSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        StaticSenderFactory.senderMail().send();
        StaticSenderFactory.senderSms().send();
    }
}
