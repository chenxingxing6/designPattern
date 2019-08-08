package behavior_pattern.templatemethod;

import java.math.BigDecimal;

/**
 * User: lanxinghua
 * Date: 2019/8/8 11:45
 * Desc:
 */
public class Minus extends AbstractCalculator<Double> {

    @Override
    public Double calc(Double num1, Double num2) {
        BigDecimal b1 = new BigDecimal(num1.toString());
        BigDecimal b2 = new BigDecimal(num2.toString());
        return b1.subtract(b2).doubleValue();
    }
}
