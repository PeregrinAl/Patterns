package GenerativePatterns.DishBuilder;

public class DishBuilder implements IDishBuilder {

    @Override
    public IDishBuilder createOrder(String order) {
        System.out.println("Кухня: заказ на " + order);
        return this;
    }

    @Override
    public IDishBuilder startCooking() {
        System.out.println("Приготовление . . .");
        return this;
    }

    @Override
    public void cookingTimer() {
        System.out.println("Вывод оставшегося времени");
    }

    public void ready() {
        System.out.println("Заказ готов");
        new Dish();
    }
}
