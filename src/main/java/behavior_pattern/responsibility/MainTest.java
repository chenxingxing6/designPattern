package behavior_pattern.responsibility;

/**
 * User: lanxinghua
 * Date: 2019/7/24 14:55
 * Desc:
 */
public class MainTest {

    /* 获取责任链*/
    private static Handler getChainHandler(){
        Handler consoleHandler = new ConsoleHandler();
        Handler fileHandler = new FileHandler();
        consoleHandler.setNextHandler(fileHandler);
        return consoleHandler;
    }

    public static void main(String[] args) {
        Handler loggerChain = getChainHandler();
        loggerChain.info("你好");
        loggerChain.debug("你好");
        loggerChain.warn("你好");
        loggerChain.error("你好");
    }
}
