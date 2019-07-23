package structure_pattern.adapter.interfacepattern;

import structure_pattern.adapter.classpattern.Targetable;

/**
 * User: lanxinghua
 * Date: 2019/7/23 17:24
 * Desc:
 */
public class MainTest {
    public static void main(String[] args) {
        Targetable targetable1 = new Targetable1();
        Targetable targetable2 = new Targetable2();

        targetable1.method1();
        targetable2.method2();
    }
}
