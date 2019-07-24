package hutool.poi;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import cn.hutool.poi.excel.StyleSet;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: lanxinghua
 * Date: 2019/7/24 16:52
 * Desc: excel生成
 */
public class ExcelWriterTest {
    private static final String path = "/Users/cxx/work/study/designPattern/test.xlsx";
    private List<List<String>> rows = new ArrayList<>();

    @Before
    public void buildData(){
        List<String> row1 = CollUtil.newArrayList("aa1", "bb1", "cc1", "dd1");
        List<String> row2 = CollUtil.newArrayList("aa2", "bb2", "cc2", "dd2");
        List<String> row3 = CollUtil.newArrayList("aa3", "bb3", "cc3", "dd3");
        rows.addAll(CollUtil.newArrayList(row1, row2, row3));
    }

    @Test
    public void writerTest1(){
        delFile(path);
        ExcelWriter writer = ExcelUtil.getWriter(path);
        // 跳过某行
        writer.passCurrentRow();

        // 合并单元格
        writer.merge(4-1, "测试标题");

        // 写出
        writer.write(rows, true);

        // 关闭writer，释放内存
        writer.close();
    }

    @Test
    public void writerTest2(){
        Student student1 = new Student();
        student1.setName("小明");
        student1.setAge(20);
        student1.setBirthday(DateUtil.date());
        student1.setAddress("杭州");

        Student student2 = new Student();
        student2.setName("王星");
        student2.setAge(22);
        student2.setBirthday(DateUtil.date());
        student2.setAddress("江西");
        List<Student> rows = CollUtil.newArrayList(student1, student2);

        delFile(path);
        ExcelWriter writer = ExcelUtil.getWriter(path, "合计");
        // 标题设置别名
        writer.addHeaderAlias("name", "姓名");
        writer.addHeaderAlias("age", "年龄");
        writer.addHeaderAlias("address", "地址");
        writer.addHeaderAlias("birthday", "生日");

        writer.merge(3, "人员名单");

        // 设置样式
        CellStyle headCellStyle = writer.getHeadCellStyle();

        Font font = writer.createFont();
        font.setBold(true);
        font.setColor(Font.COLOR_RED);
        font.setFontHeight((short) 320);
        font.setItalic(true);
        headCellStyle.setFont(font);

        writer.write(rows, true);
        writer.close();

    }

    private void delFile(String path){
        File file = new File(path);
        if (file.exists()){
            file.delete();
        }
    }
}

class Student{
    private String name;
    private Integer age;
    private String address;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
