package hutool.poi;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.sax.Excel07SaxReader;
import cn.hutool.poi.excel.sax.handler.RowHandler;
import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;

/**
 * User: lanxinghua
 * Date: 2019/7/24 16:33
 * Desc: exce读取
 */
public class ExcelReadTest {
    @Test
    public void read1Test(){
        ExcelReader reader = ExcelUtil.getReader(FileUtil.file("/Users/cxx/Downloads/file.xlsx"));
        System.out.println(JSON.toJSONString(reader.read()));
    }

    @Test
    public void read2Test(){
        Excel07SaxReader reader = new Excel07SaxReader(createrRowHandler());
        reader.read("/Users/cxx/Downloads/file.xlsx", 0);
    }

    private static RowHandler createrRowHandler() {
        return new RowHandler() {
            @Override
            public void handle(int sheetIndex, int rowIndex, List<Object> list) {
                Console.log("{},{},{}", sheetIndex, rowIndex, JSON.toJSON(list));
            }
        };
    }
}
