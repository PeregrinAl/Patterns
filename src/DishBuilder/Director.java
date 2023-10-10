package DishBuilder;

public class Director {
    public void Salad(IDishBuilder dishBuilder) {
        dishBuilder.createOrder("Салат").startCooking().cookingTimer();

    }
    public void Pancakes(IDishBuilder dishBuilder) {
        dishBuilder.createOrder("Блины").startCooking().cookingTimer();
    }
    public void Soup(IDishBuilder dishBuilder) {
        dishBuilder.createOrder("Суп").startCooking().cookingTimer();
    }
}
