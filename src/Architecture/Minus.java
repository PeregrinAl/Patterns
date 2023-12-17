package Architecture;

public class Minus implements ICommand {
    @Override
    public int exec(int a, int b) {
        return a - b;
    }
}
