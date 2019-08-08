package behavior_pattern.strategy;

/**
 * User: lanxinghua
 * Date: 2019/8/8 15:54
 * Desc:
 */
public class OperationAdd implements IStrategy {
    @Override
    public int calc(int num1, int num2) {
        return num1 + num2;
    }
}
