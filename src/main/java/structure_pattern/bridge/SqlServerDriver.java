package structure_pattern.bridge;

/**
 * User: lanxinghua
 * Date: 2019/7/24 10:56
 * Desc:
 */
public class SqlServerDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("sqlserver driver connect");
    }
}
