package behavior_pattern.interpreter;

/**
 * User: lanxinghua
 * Date: 2019/8/20 10:24
 * Desc: 解释器模式
 * 一般主要应用在OOP【object oriented programming】开发中的编译器的开发中，所以适用面比较窄
 */
public class MainTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.setNum1(10);
        context.setNum2(5);
        Expression expression = new Minus();
        int result = expression.interpreter(context);
        System.out.println(result);
    }
}
