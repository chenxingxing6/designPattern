package behavior_pattern.memo;

/**
 * User: lanxinghua
 * Date: 2019/8/20 10:45
 * Desc: 原始类
 */
public class Original {
    private String value;

    public Original(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memo createMemo(){
        return new Memo(value);
    }

    public void rollback(Memo memo){
        this.value = memo.getValue();
    }
}
