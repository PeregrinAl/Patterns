package GenerativePatterns.DishBuilder;

public class Notification {
    public int number;
    public String order;
    public double time;
    Notification(int number, String order, Double time) {
        this.number = number;
        this.order = order;
        this.time = time;
    }

    public void callNotification() {
        System.out.println("Заказ " + order + number + " готов!");
    }
}
