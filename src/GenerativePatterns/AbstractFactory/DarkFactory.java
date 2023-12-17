package GenerativePatterns.AbstractFactory;

public class DarkFactory implements IFactory {
    @Override
    public IButton createButton() {
        System.out.println("Была создана кнопка. DarkTheme");
        return new DarkButton();
    }

    @Override
    public ILabel createLabel() {
        System.out.println("Была создана надпись. DarkTheme");
        return new DarkLabel();
    }
}
