package StructuralPatterns.MyAdapter;

public class PlantAdapter implements IPlant {
    public FlyCatcher flyCatcher;
    public PlantAdapter(FlyCatcher flyCatcher) {
        this.flyCatcher = flyCatcher;
    }
    @Override
    public String eat(PFC pfc) {
        return (flyCatcher.eatCrazyDish(baseMeat(pfc)) + String.format("Proteins: %d fats: %d carbons %d",
                pfc.proteins, pfc.fats, pfc.carbons));
    }
    public Meat baseMeat(PFC pfc) {
        return new Meat(MeatKinds.bear, new PFC(pfc.proteins,pfc.fats, pfc.carbons));
    }
}
