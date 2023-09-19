public class Program {

    public static void main (String[] args) {
        IFactory widgetFactory = new DarkFactory();
        IButton mainButton = widgetFactory.createButton();
        ILabel mainLabel = widgetFactory.createLabel();

    }

}

