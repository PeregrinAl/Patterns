package Command;

public class Divide implements ICommand {

    @Override
    public void execute(PairEditor pairEditor) {
        pairEditor.setResult((float)pairEditor.getNumberA() / pairEditor.getNumberB());
    }
}
