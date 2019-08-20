package behavior_pattern.visitor;

/**
 * User: lanxinghua
 * Date: 2019/8/20 11:15
 * Desc:
 */
public class MainTest {
    public static void main(String[] args) {
        // 主体
        ComputerPart mouse = new Mouse();
        ComputerPart keyboard = new Keyboard();

        // 访问者
        Visitor visitor = new Visitor();

        mouse.accept(visitor);
        keyboard.accept(visitor);
    }
}
