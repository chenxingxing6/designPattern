package structure_pattern.bridge;

/**
 * User: lanxinghua
 * Date: 2019/7/24 10:59
 * Desc: 桥梁类
 */
public abstract class AbstractBridge {
    private Driver driver;

    public void connect(){
        driver.connect();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
