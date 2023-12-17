package Architecture;

public class Editor implements IWidget {
    final private IWindow window;
    public String text;
    Editor(IWindow window) {
        this.window = window;
    }
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void notifyClick() {

    }

    @Override
    public void setCommand(ICommand command) {

    }

    @Override
    public void push(int i, int parseInt) {

    }
}
