package behavior_pattern.command;

/**
 * User: lanxinghua
 * Date: 2019/7/24 11:40
 * Desc:
 */
public class MyCommand implements ICommand {
    private Receiver receiver;

    public MyCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.action("mycommand");
    }
}
