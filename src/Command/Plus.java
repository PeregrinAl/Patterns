package Command;

public class Plus implements ICommand {

    @Override
    public void execute(PairEditor pairEditor) {
        pairEditor.setResult(pairEditor.getNumberA() + pairEditor.getNumberB());
        pairEditor.history.push(this);
    }

}
