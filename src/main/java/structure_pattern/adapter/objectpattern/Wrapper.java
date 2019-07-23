package structure_pattern.adapter.objectpattern;

import structure_pattern.adapter.classpattern.Source;
import structure_pattern.adapter.classpattern.Targetable;

/**
 * User: lanxinghua
 * Date: 2019/7/23 17:15
 * Desc: 对象的适配器 只是将Adapter类进行修改，不基础source，而是持有source类实例，来解决兼容性问题
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source){
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is targetable method2");
    }

    public static void main(String[] args) {
        Targetable targetable = new Wrapper(new Source());
        targetable.method1();

        targetable.method2();
    }
}
