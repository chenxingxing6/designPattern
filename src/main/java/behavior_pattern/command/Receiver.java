package behavior_pattern.command;

/**
 * User: lanxinghua
 * Date: 2019/7/24 11:33
 * Desc: 接受者
 */
public class Receiver {
    public void action(String command){
        System.out.println("接收到命令："+ command);
    }
}
