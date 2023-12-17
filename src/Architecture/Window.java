package Architecture;

import java.util.Objects;

public class Window implements IWindow {

    public Editor getEditorLeft() {
        return editorLeft;
    }

    public void setEditorLeft(Editor editorLeft) {
        this.editorLeft = editorLeft;
    }

    public Editor getEditorRight() {
        return editorRight;
    }

    public void setEditorRight(Editor editorRight) {
        this.editorRight = editorRight;
    }

    public Editor getEditorResult() {
        return editorResult;
    }

    public void setEditorResult(Editor editorResult) {
        this.editorResult = editorResult;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    private Editor editorLeft = new Editor();
    private Editor editorRight = new Editor();
    private Editor editorResult = new Editor();
    private Button button = new Button(this);

    @Override
    public void sendSignal(String signal, IWidget widget) {
        if (Signal.PUSHED.getValue().equals(signal)) {
            widget.push(Integer.parseInt(editorLeft.getText()),
                    Integer.parseInt(editorRight.getText()));
        }

        if (Objects.equals(widget, button) && !Signal.PUSHED.getValue().equals(signal)) {
            editorResult.setText(signal);
        }
    }
}
