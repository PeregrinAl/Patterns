package MyAdapter;

public class SunFlower implements IPlant {

    @Override
    public String eat(PFC pfc) {
        return "Water and minerals were eaten. " + String.format("Proteins: %d fats: %d carbons %d",
                pfc.proteins, pfc.fats, pfc.carbons);
    }
}
