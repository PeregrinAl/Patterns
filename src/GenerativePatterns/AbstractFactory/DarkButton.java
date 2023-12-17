package GenerativePatterns.AbstractFactory;

public class DarkButton implements IButton {
    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public String getSecondColor() {
        return "Темный серый";
    }
}
