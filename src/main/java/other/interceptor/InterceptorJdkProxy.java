package other.interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * User: lanxinghua
 * Date: 2019/7/21 20:47
 * Desc: 代理对象
 */
public class InterceptorJdkProxy implements InvocationHandler {
    // 真实对象
    private Object target;
    // 拦截器全限定名
    private String interceptorClass;


    public InterceptorJdkProxy(Object target, String interceptorClass){
        super();
        this.target = target;
        this.interceptorClass = interceptorClass;
    }

    /**
     * 绑定委托对象，并返回代理对象
     * @param target
     * @param interceptorClass
     * @return
     */
    public static Object bind(Object target, String interceptorClass){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InterceptorJdkProxy(target, interceptorClass));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 不进行拦截
        if (interceptorClass == null){
            return method.invoke(target, args);
        }
        Object result = null;
        // 通过发射获取拦截器
        IInterceptor interceptor = (IInterceptor)Class.forName(interceptorClass).newInstance();
        if (interceptor.before(proxy, target, method, args)) {
            result = method.invoke(target, args);
        }else {
            interceptor.around(proxy, target, method, args);
        }
        interceptor.after(proxy, target, method, args);
        return result;
    }

    public static void main(String[] args) {
        HelloWorld proxy = (HelloWorld)InterceptorJdkProxy.bind(new HelloWorldImpl(), "other.interceptor.impl.MyInterceptor");
        proxy.sayHello();
    }
}

interface HelloWorld{
    public void sayHello();
}

class HelloWorldImpl implements HelloWorld{
    public void sayHello(){
        System.out.println("say hello!!!");
    }
}
