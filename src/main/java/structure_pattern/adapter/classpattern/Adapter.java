package structure_pattern.adapter.classpattern;

/**
 * User: lanxinghua
 * Date: 2019/7/23 10:50
 * Desc: 类的适配器
 */
public class Adapter extends Source implements Targetable{
    @Override
    public void method2() {
        System.out.println("this is targetable method2");
    }

    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();

        targetable.method2();
    }
}
