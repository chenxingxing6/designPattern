package create_pattern.factory;

/**
 * User: lanxinghua
 * Date: 2019/7/20 15:49
 * Desc: 工厂模式
 */
public class SenderFactory {
    public ISender senderMail(){
        return new MailSender();
    }

    public ISender senderSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        ISender sender = factory.senderSms();
        sender.send();
    }
}
