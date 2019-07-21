package structure_pattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import structure_pattern.proxy.impl.HelloWord;

import java.lang.reflect.Method;

/**
 * User: lanxinghua
 * Date: 2019/7/21 21:09
 * Desc: cglib动态代理
 */
public class CglibProxy implements MethodInterceptor {

    /**
     * 生成CGlib代理对象
     * @param cls
     * @return
     */
    public Object getProxy(Class cls){
        // cglib enhancer增强类对象
        Enhancer enhancer = new Enhancer();
        // 设置产生的代理对象的父类。
        enhancer.setSuperclass(cls);
        // 定义代理逻辑对象为当前对象
        enhancer.setCallback(this);
        // 返回代理对象
        return enhancer.create();
    }

    /**
     * 代理逻辑方法
     * @param proxy
     * @param method
     * @param args
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //调用proxy.invoke()方法，会报java.lang.StackOverflowError错误，原因是invoke()内部会一直被反复调用
        return methodProxy.invokeSuper(proxy, args);
    }

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        HelloWord helloWord = (HelloWord) proxy.getProxy(HelloWord.class);
        helloWord.sayHello("cglib动态代理");
    }
}
