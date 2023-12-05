package Command;

public class Minus implements ICommand {

    @Override
    public void execute(PairEditor pairEditor) {
        pairEditor.setResult(pairEditor.getNumberA() - pairEditor.getNumberB());
    }

}
