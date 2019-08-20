package behavior_pattern.interpreter;

/**
 * User: lanxinghua
 * Date: 2019/8/20 10:23
 * Desc:
 */
public class Add implements Expression {
    @Override
    public int interpreter(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
