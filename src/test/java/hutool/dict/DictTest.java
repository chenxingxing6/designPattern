package hutool.dict;

import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.Dict;
import org.junit.Test;

/**
 * User: lanxinghua
 * Date: 2019/7/24 18:33
 * Desc:
 */
public class DictTest {
    @Test
    public void dictTest(){
        Dict dict = Dict.create()
                .set("key1", 1)
                .set("key2", 2L)
                .set("key3", "string");
        Integer aa = dict.getInt("key1");
        Console.log(aa);
    }

}
