package structure_pattern.bridge;

/**
 * User: lanxinghua
 * Date: 2019/7/24 11:02
 * Desc:
 */
public class MainTest {
    public static void main(String[] args) {
        // 驱动
        Driver mysqlDriver = new MysqlDriver();
        Driver sqlServerDriver = new SqlServerDriver();
        Driver oracleDriver = new OracleDriver();

        // 桥梁
        AbstractBridge bridge = new MyBridge();
        bridge.setDriver(mysqlDriver);
        bridge.connect();

        bridge.setDriver(sqlServerDriver);
        bridge.connect();

        bridge.setDriver(oracleDriver);
        bridge.connect();
    }
}
