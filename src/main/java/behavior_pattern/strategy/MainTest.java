package behavior_pattern.strategy;

/**
 * User: lanxinghua
 * Date: 2019/8/8 15:56
 * Desc:
 */
public class MainTest {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(1, 2));
    }
}
