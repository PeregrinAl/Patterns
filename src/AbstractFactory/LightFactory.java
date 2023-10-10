package AbstractFactory;

public class LightFactory implements IFactory {
    @Override
    public IButton createButton() {
        System.out.println("Была создана кнопка. LightTheme");
        return new LightButton();
    }

    @Override
    public ILabel createLabel() {
        System.out.println("Была создана надпись. LightTheme");
        return new LightLabel();
    }
}
