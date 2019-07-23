package structure_pattern.decorator;

/**
 * User: lanxinghua
 * Date: 2019/7/23 17:36
 * Desc: 装饰器设计模式（给对象动态增加功能）
 * 要求装饰器对象和被装饰的对象实现同一个接口，装饰器对象持有被装饰对象
 */
public class Decorator implements Targetable{
    // 被装饰对象
    private Target target;

    public Decorator(Target target){
        this.target = target;
    }

    @Override
    public void method() {
        System.out.println("before");
        target.method();
        System.out.println("after");
    }

    public static void main(String[] args) {
        Targetable targetable = new Decorator(new Target());
        targetable.method();
    }
}
