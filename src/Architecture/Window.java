package Architecture;

import java.util.Objects;

public class Window implements IWindow {
    private final Editor editorLeft = new Editor(this);
    private final Editor editorRight = new Editor(this);
    private final Editor editorResult = new Editor(this);
    private final Button button = new Button(this);

    @Override
    public void sendSignal(String string, IWidget widget) {
        if (Objects.equals(string, "Pushed")) {
            widget.push(Integer.parseInt(editorLeft.getText()),
                    Integer.parseInt(editorRight.getText()));
        }

        if (widget.equals(button) && !Objects.equals(string, "Pushed")) {
            editorResult.text = string;
        } 
    }
}
