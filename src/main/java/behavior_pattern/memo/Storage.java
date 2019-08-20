package behavior_pattern.memo;

/**
 * User: lanxinghua
 * Date: 2019/8/20 10:46
 * Desc: 备忘录管理，和客户端代码耦合
 */
public class Storage {
    private Memo memo;

    public Storage(Memo memo){
        this.memo = memo;
    }

    public Memo getMemo() {
        return memo;
    }

    public void setMemo(Memo memo) {
        this.memo = memo;
    }

    public static void main(String[] args) {
        // 1.创建原始类
        Original original = new Original("value");

        // 2.创建备忘录
        Memo memo1 = original.createMemo();
        Storage storage = new Storage(memo1);

        // 3.修改原始类
        System.out.println(original.getValue());
        original.setValue("update value");
        System.out.println(original.getValue());

        // 4.回到原始状态
        original.rollback(storage.getMemo());
        System.out.println(original.getValue());
    }
}
