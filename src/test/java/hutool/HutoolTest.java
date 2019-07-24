package hutool;

import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.Singleton;
import cn.hutool.core.util.RuntimeUtil;
import cn.hutool.core.util.ZipUtil;
import cn.hutool.crypto.SecureUtil;

/**
 * User: lanxinghua
 * Date: 2019/7/22 09:41
 * Desc:
 */
public class HutoolTest {
    public static void main(String[] args) {
        String pwd = SecureUtil.md5("123456");
        Console.log(pwd);

    }


}
