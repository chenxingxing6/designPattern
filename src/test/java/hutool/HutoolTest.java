package hutool;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.RuntimeUtil;

/**
 * User: lanxinghua
 * Date: 2019/7/22 09:41
 * Desc:
 */
public class HutoolTest {
    public static void main(String[] args) {
        String str = RuntimeUtil.execForStr("curl", "http://www.baidu.com");
        System.out.println(str);
    }


}
