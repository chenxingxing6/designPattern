package other.interceptor;

import java.lang.reflect.Method;

/**
 * User: lanxinghua
 * Date: 2019/7/21 20:40
 * Desc: 拦截器模式
 */
public interface IInterceptor {
    /**
     *
     * @param proxy   代理对象
     * @param target  真实对象
     * @param method  method方法
     * @param args    运行方法参数
     * @return        为false调用around方法 -> after
     */
    public boolean before(Object proxy, Object target, Method method, Object[] args);

    public void around(Object proxy, Object target, Method method, Object[] args);

    public void after(Object proxy, Object target, Method method, Object[] args);
}
