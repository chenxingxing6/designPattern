package structure_pattern.decorator;

/**
 * User: lanxinghua
 * Date: 2019/7/23 17:35
 * Desc:
 */
public class Target implements Targetable {
    @Override
    public void method() {
        System.out.println("run method");
    }
}
