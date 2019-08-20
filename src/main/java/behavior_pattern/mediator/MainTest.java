package behavior_pattern.mediator;

/**
 * User: lanxinghua
 * Date: 2019/8/20 10:36
 * Desc:
 */
public class MainTest {
    public static void main(String[] args) {
        User a = new User("a");
        User b = new User("b");
        a.sendMsg("hello b");
        b.sendMsg("hello a");
    }
}
