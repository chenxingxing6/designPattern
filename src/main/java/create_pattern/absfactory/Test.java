package create_pattern.absfactory;

/**
 * User: lanxinghua
 * Date: 2019/7/20 16:17
 * Desc:
 */
public class Test {
    public static void main(String[] args) {
        AbstractSenderFactory factory = new SendMailFactory();
        factory.sender().send();
    }
}
