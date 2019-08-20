package behavior_pattern.memo;

/**
 * User: lanxinghua
 * Date: 2019/8/20 10:46
 * Desc: 备忘录
 */
public class Memo {
    private String value;

    public Memo(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
