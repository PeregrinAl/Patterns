package Command;

public class Plus implements ICommand {
    private PairEditor backup;
    public PairEditor pairEditor;
    public Plus(PairEditor pairEditor_) {
        this.pairEditor = pairEditor_;
    }

    @Override
    public Boolean execute() {
        saveBackup();
        pairEditor.setResult(pairEditor.getNumberA() + pairEditor.getNumberB());
        pairEditor.history.push(this);
        return true;
    }

    @Override
    public void saveBackup() {
        this.backup = this.pairEditor;
    }

    @Override
    public void undo() {
        this.pairEditor = this.backup;
    }

    @Override
    public String getName() {
        return " Plus ";
    }
}
