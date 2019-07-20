package create_pattern.absfactory;

import create_pattern.factory.ISender;
import create_pattern.factory.MailSender;

/**
 * User: lanxinghua
 * Date: 2019/7/20 16:15
 * Desc:
 */
public class SendMailFactory implements AbstractSenderFactory {
    @Override
    public ISender sender() {
        return new MailSender();
    }
}
