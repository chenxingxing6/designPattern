package create_pattern.singleton;

import java.util.Objects;

/**
 * User: lanxinghua
 * Date: 2019/7/20 09:40
 * Desc: 单例设计模式（线程安全懒汉式）
 */
public class Singleton3 {
    private static Singleton3 instance = null;

    public static synchronized Singleton3 getInstance(){
        if (Objects.isNull(instance)){
            instance = new Singleton3();
        }
        return instance;
    }

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton3(){

    }


}
