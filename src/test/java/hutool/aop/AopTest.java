package hutool.aop;

import cn.hutool.aop.ProxyUtil;
import cn.hutool.aop.aspects.TimeIntervalAspect;
import cn.hutool.core.lang.Console;
import org.junit.Test;

/**
 * User: lanxinghua
 * Date: 2019/7/24 17:38
 * Desc:
 */
public class AopTest {
    @Test
    public void jdkTest(){
        Animal cat = ProxyUtil.proxy(new Cat(), TimeIntervalAspect.class);
        cat.eat();
    }

    @Test
    public void cglibTest(){

    }
}

interface Animal{
    void eat();
}

class Cat implements Animal{
    @Override
    public void eat() {
        Console.log("猫吃鱼");
    }
}
