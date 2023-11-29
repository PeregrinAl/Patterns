package MyAdapter;

public class FlyCatcher implements IMadPlant {

    @Override
    public String eatNormalDish(PFC pfc) {
        return "Water and minerals were eaten";
    }

    @Override
    public String eatCrazyDish(Meat kindOfMeat) {
        return "Little" + kindOfMeat.toString() + "was eaten! ";
    }
}
