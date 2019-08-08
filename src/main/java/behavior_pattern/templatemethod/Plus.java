package behavior_pattern.templatemethod;

/**
 * User: lanxinghua
 * Date: 2019/8/8 11:45
 * Desc:
 */
public class Plus extends AbstractCalculator<Integer> {


    @Override
    public Integer calc(Integer num1, Integer num2) {
        return java.lang.Integer.valueOf((int)num1 + (int)num2);
    }
}
