import AbstractFactory.DarkFactory;
import AbstractFactory.IButton;
import AbstractFactory.IFactory;
import AbstractFactory.ILabel;
import Adapter.*;
import DishBuilder.Director;
import DishBuilder.DishBuilder;
import DishBuilder.NotificationBuilder;
import DishBuilder.Notification;

public class Program {
    public static void client(IPlotter plotter,
                              IFunction fun,
                              IPlotter.Boundary boundary) {
        plotter.plot(fun, boundary);
    }

    public static void main (String[] args) {
//         IFactory widgetFactory = new DarkFactory();
//         IButton mainButton = widgetFactory.createButton();
//         ILabel mainLabel = widgetFactory.createLabel();
//        var plotter = new AdapterMathGL4J();
//        var sin = new Sin();
//        var sqr = new Sqr();
//        var boundary = new IPlotter.Boundary(-3.0, 3.0);
//        client(plotter, sqr, boundary);

        Director director = new Director();
        DishBuilder builder = new DishBuilder();
        director.Salad(builder);
        builder.ready();

        NotificationBuilder notificationBuilder = new NotificationBuilder();
        director.Salad(notificationBuilder);
        Notification myNotification = notificationBuilder.ready();

    }
} 

