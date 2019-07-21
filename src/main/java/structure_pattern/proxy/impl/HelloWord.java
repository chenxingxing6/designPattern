package structure_pattern.proxy.impl;

import structure_pattern.proxy.IHelloWord;

/**
 * User: lanxinghua
 * Date: 2019/7/21 21:08
 * Desc:
 */
public class HelloWord implements IHelloWord {

    @Override
    public void sayHello(String msg) {
        System.out.println("say:"+ msg);
    }
}
