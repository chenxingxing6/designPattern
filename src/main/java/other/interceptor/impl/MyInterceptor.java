package other.interceptor.impl;

import other.interceptor.IInterceptor;

import java.lang.reflect.Method;

/**
 * User: lanxinghua
 * Date: 2019/7/21 20:44
 * Desc: 自定义拦截器
 */
public class MyInterceptor implements IInterceptor {
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("before");
        return false;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("around");
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("after");
    }
}
