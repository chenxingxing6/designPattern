package hutool.ssh;

import cn.hutool.core.lang.Validator;
import cn.hutool.extra.ssh.JschUtil;
import com.jcraft.jsch.Session;
import org.junit.Test;

/**
 * User: lanxinghua
 * Date: 2019/7/24 18:10
 * Desc:
 */
public class SshTest {
    @Test
    public void connectSshTest(){
        Session session = JschUtil.getSession("10.1.24.243", 22,"root", "sdfsdf");

    }
}
