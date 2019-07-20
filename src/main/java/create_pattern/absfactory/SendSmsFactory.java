package create_pattern.absfactory;

import create_pattern.factory.ISender;
import create_pattern.factory.SmsSender;

/**
 * User: lanxinghua
 * Date: 2019/7/20 16:15
 * Desc:
 */
public class SendSmsFactory implements AbstractSenderFactory {
    @Override
    public ISender sender() {
        return new SmsSender();
    }
}
