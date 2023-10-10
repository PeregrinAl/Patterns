package DishBuilder;

public interface IDishBuilder {
    public IDishBuilder createOrder(String order);
    public IDishBuilder startCooking();
    public void cookingTimer();
}
