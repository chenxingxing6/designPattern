package create_pattern.absfactory;

import create_pattern.factory.ISender;

/**
 * User: lanxinghua
 * Date: 2019/7/20 16:13
 * Desc: 抽象工厂
 */
public interface AbstractSenderFactory {
    public ISender sender();
}
