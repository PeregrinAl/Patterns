package GenerativePatterns.DishBuilder;

public class Director {
    public IDishBuilder dishBuilder;
    public Director(IDishBuilder dishBuilder) {
        this.dishBuilder = dishBuilder;
    }
    public void Cook(String recipe) {
        dishBuilder.createOrder(recipe).startCooking().cookingTimer();

    }
}
