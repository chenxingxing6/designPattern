package behavior_pattern.command;

/**
 * User: lanxinghua
 * Date: 2019/7/24 11:43
 * Desc: 调用者
 */
public class Invoker {
    private ICommand command;

    public Invoker(ICommand command){
        this.command = command;
    }

    public void action(){
        command.exec();
    }

    public static void main(String[] args) {
        // 创建命令
        ICommand cmd = new MyCommand(new Receiver());
        // 创建执行者
        Invoker invoker = new Invoker(cmd);
        // 调用
        invoker.action();
    }
}
