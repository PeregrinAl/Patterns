package Command;

import java.util.ArrayList;

public class History {
    private final ArrayList<ICommand> history = new ArrayList<ICommand>();
    public void push(ICommand command) {
        this.history.add(command);
    }
    public ICommand pop() {
        var last = this.history.getLast();
        this.history.removeLast();
        return last;
    }
}
