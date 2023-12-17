package Architecture;

public class Plus implements ICommand {
    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
