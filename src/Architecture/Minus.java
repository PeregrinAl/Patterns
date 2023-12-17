package Architecture;

public class Minus implements ICommand {

    @Override
    public int exec(int... params) {
        return params[0] - params[1];
    }
}
