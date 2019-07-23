package structure_pattern.adapter.interfacepattern;

/**
 * User: lanxinghua
 * Date: 2019/7/23 17:23
 * Desc:
 */
public class Targetable1 extends Wrapper {
    @Override
    public void method1() {
        System.out.println("this is Targetable1 method1");
    }
}
