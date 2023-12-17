package Architecture;

public class Button implements IWidget {
    private ICommand command;
    final private IWindow window;
    Button(IWindow window) {
        this.window = window;
    }
    @Override
    public void notifyClick() {
        window.sendSignal(Signal.PUSHED.getValue(), this);
    }
    @Override
    public void setCommand(ICommand command) {
        this.command = command;
    }

    @Override
    public void push(int a, int b) {
        window.sendSignal(String.valueOf(command.exec(a, b)), this);
    }
}
