package create_pattern.prototype;

import java.io.*;

/**
 * User: lanxinghua
 * Date: 2019/7/20 18:08
 * Desc: 该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
 */
public class Prototype implements Cloneable, Serializable {
    private String value;

    public Object clone(){
        // 浅拷贝
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return prototype;
    }

    // 利用串行化来做深复制 “冷冻”或者“腌咸菜（picking）”过程
    public Object deepClone(){
        try {
            /* 写入当前对象的二进制流 */
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            /* 读出二进制流产生的新对象 */
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Prototype before = new Prototype();
        before.setValue("before");
        Prototype after = (Prototype)before.clone();
        after.setValue("after");
        System.out.println("before:"+before);
        System.out.println("after:"+after);
    }


}
