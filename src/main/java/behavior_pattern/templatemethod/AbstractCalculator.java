package behavior_pattern.templatemethod;

/**
 * User: lanxinghua
 * Date: 2019/8/8 11:41
 * Desc:
 */
public abstract class AbstractCalculator<T> {
    public final T calculate(T num1, T num2){
        return calc(num1, num2);
    }

    abstract public T calc(T num1, T num2);
}
