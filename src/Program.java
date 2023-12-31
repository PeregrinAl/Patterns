import Architecture.Window;
import Command.*;
import GenerativePatterns.AbstractFactory.*;
import StructuralPatterns.Adapter.*;
import StructuralPatterns.Decorator.*;
import GenerativePatterns.DishBuilder.*;
import GenerativePatterns.DishBuilder.Director;
import StructuralPatterns.MyAdapter.FlyCatcher;
import StructuralPatterns.MyAdapter.IPlant;
import StructuralPatterns.MyAdapter.PlantAdapter;
import StructuralPatterns.MyAdapter.SunFlower;
import StructuralPatterns.MyAdapter.PFC;

public class Program {
    public static void client(IPlotter plotter,
                              IFunction fun,
                              IPlotter.Boundary boundary) {
        plotter.plot(fun, boundary);
    }

    public static void GetUI(IFactory factory) {
        IButton button = factory.createButton();
        ILabel label = factory.createLabel();
        System.out.println(button.getSecondColor());
        System.out.println(label.getRGB());

    }

    public static void GetProduct(IDishBuilder builder) {
        Director director = new Director(builder);
        director.Cook("Салат");
    }

    public static void ImageProcessDecorator(ImageDecorator imageEditor, String path) {
        imageEditor.saveImage();
        imageEditor.LoadImage(path);
        imageEditor.RotateImage(25);
    }

    public static void makePlantEat(IPlant plant, PFC pfc) {
        System.out.println(plant.eat(pfc));
    }

    public static void calculatorClient(Button button, PairEditor pairEditor) {
        button.setCommand(new Plus());
        button.executeCommand(pairEditor);
        System.out.println(pairEditor);

        button.setCommand(new Minus());
        button.executeCommand(pairEditor);
        System.out.println(pairEditor);

        button.setCommand(new Divide());
        button.executeCommand(pairEditor);
        System.out.println(pairEditor);
    }
    public static void calculate(String left, String right, Architecture.ICommand command) {
        Window window = new Window();
        window.getEditorLeft().setText(left);
        window.getEditorRight().setText(right);

        window.getButton().setCommand(command);
        window.getButton().notifyClick();

        System.out.println(window.getEditorResult().getText());
    }

    public static void main (String[] args) {
//        IFactory widgetFactory = new DarkFactory();
//
//        GetUI(widgetFactory);
//        IFactory widgetLightFactory = new LightFactory();
//        GetUI(widgetLightFactory);
//
//        var plotter = new AdapterMathGL4J();
//        var sin = new Sin();
//        var sqr = new Sqr();
//        var boundary = new IPlotter.Boundary(-3.0, 3.0);
//        client(plotter, sqr, boundary);

//        GenerativePatterns.DishBuilder builder = new GenerativePatterns.DishBuilder();
//        NotificationBuilder notificationBuilder = new NotificationBuilder();
//
//        GetProduct(notificationBuilder);
//        Notification myNotification = notificationBuilder.ready();
//
//        GetProduct(builder);

//        var imageEditor = new ImageEditor();
//        var newImageEditor = new ImageCache(imageEditor);
//        var cropRectEditor = new ImageLeftRotate(newImageEditor);
//
//        ImageProcessDecorator(cropRectEditor, "C://Sasha");
//
//        PFC pfc = new PFC(10,13,19);
//
//        SunFlower sunFlower = new SunFlower();
//        FlyCatcher flyCatcher = new FlyCatcher();
//        makePlantEat(sunFlower, pfc);
//        makePlantEat(new PlantAdapter(flyCatcher), pfc);

//        PairEditor pairEditor = new PairEditor();
//        pairEditor.setNumberA(26);
//        pairEditor.setNumberB(5);
//        Button button = new Button();
//        calculatorClient(button, pairEditor);
        calculate("5", "2", new Architecture.Multiply());
        calculate("5", "2", new Architecture.Plus());
        calculate("5", "2", new Architecture.Minus());
    }
} 

