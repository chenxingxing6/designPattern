package behavior_pattern.strategy;

/**
 * User: lanxinghua
 * Date: 2019/8/8 15:55
 * Desc:
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.calc(num1, num2);
    }
}
