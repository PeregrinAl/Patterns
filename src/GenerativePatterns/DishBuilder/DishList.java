package GenerativePatterns.DishBuilder;

import java.util.HashMap;

public class DishList {
    public static HashMap<String, Double> map = new HashMap<>();

    DishList() {
        map.put("Салат", 0.2);
        map.put("Суп", 0.2);
        map.put("Блины", 1d);
    }
}
