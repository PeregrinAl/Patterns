package Command;
// invoker (исполнитель) Button
public class Button {
    private ICommand command;

    public void setCommand(ICommand command_) {
        this.command = command_;
        //this.pairEditor = pairEditor_;
    }

    public void executeCommand(PairEditor pairEditor) {
        this.command.execute(pairEditor);
    }
}
