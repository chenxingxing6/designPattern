package structure_pattern.bridge;

/**
 * User: lanxinghua
 * Date: 2019/7/24 10:57
 * Desc:
 */
public class OracleDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("oracle driver connect");
    }
}
