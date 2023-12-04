package Command;
// invoker (исполнитель) Button
public class Button {
    private ICommand command;
    private PairEditor pairEditor;

    public void setCommand(ICommand command_, PairEditor pairEditor_) {
        this.command = command_;
        this.pairEditor = pairEditor_;
    }

    public void undo() {
        var command = pairEditor.history.pop();
        command.undo();
    }

    public void executeCommand() {
        this.command.execute();
    }
}
