package hutool.system;

import cn.hutool.core.lang.Console;
import cn.hutool.system.SystemUtil;
import org.junit.Test;

/**
 * User: lanxinghua
 * Date: 2019/7/24 17:32
 * Desc:
 */
public class SystemTest {
    @Test
    public void test1(){
        Console.log(SystemUtil.getJavaInfo());
        Console.log(SystemUtil.getJvmInfo());
        Console.log(SystemUtil.getJavaSpecInfo());
        Console.log(SystemUtil.getJavaRuntimeInfo());

        Console.log(SystemUtil.getUserInfo());
        Console.log(SystemUtil.getHostInfo());
        Console.log(SystemUtil.getTotalThreadCount());
        Console.log(SystemUtil.getJavaRuntimeInfo());
    }
}
