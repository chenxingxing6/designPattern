package behavior_pattern.templatemethod;

/**
 * User: lanxinghua
 * Date: 2019/8/8 11:46
 * Desc: 测试
 */
public class MainTest {
    public static void main(String[] args) {
        // 加法
        AbstractCalculator<Integer> calculator = new Plus();
        System.out.println(calculator.calculate(1, 2));

        // 减法
        AbstractCalculator<Double> calculator1 = new Minus();
        System.out.println(calculator1.calculate(2.05, 1.9));
    }
}
