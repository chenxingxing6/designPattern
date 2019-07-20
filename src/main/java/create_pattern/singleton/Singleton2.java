package create_pattern.singleton;

import java.util.Objects;

/**
 * User: lanxinghua
 * Date: 2019/7/20 09:40
 * Desc: 单例设计模式（懒汉式）
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    public static Singleton2 getInstance(){
        if (Objects.isNull(instance)){
            instance = new Singleton2();
        }
        return instance;
    }

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton2(){

    }


}
