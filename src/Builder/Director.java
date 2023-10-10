package Builder;

import Builder.Components.Availability;

public class Director {
    public void LowCostHome(IHomeBuilder builder) {
        builder.setConditioner(Availability.NO)
                .setDishwasher(Availability.NO)
                .setMicrowave(Availability.NO)
                .setTV(Availability.NO)
                .setFridge(Availability.NO)
                .setWashingMachine(Availability.NO)
                .setPetsAvailability(Availability.NO);
    }

    public void MiddleCostHome(IHomeBuilder builder) {
        builder.setConditioner(Availability.YES)
                .setDishwasher(Availability.NO)
                .setMicrowave(Availability.NO)
                .setTV(Availability.YES)
                .setFridge(Availability.YES)
                .setWashingMachine(Availability.NO)
                .setPetsAvailability(Availability.NO);
    }

    public void HighCostHome(IHomeBuilder builder) {
        builder.setConditioner(Availability.YES)
                .setDishwasher(Availability.YES)
                .setMicrowave(Availability.YES)
                .setTV(Availability.YES)
                .setFridge(Availability.YES)
                .setWashingMachine(Availability.YES)
                .setPetsAvailability(Availability.NO);
    }

    public void LowCostAnimalHome(IHomeBuilder builder) {
        builder.setConditioner(Availability.NO)
                .setDishwasher(Availability.NO)
                .setMicrowave(Availability.NO)
                .setTV(Availability.NO)
                .setFridge(Availability.NO)
                .setWashingMachine(Availability.NO)
                .setPetsAvailability(Availability.YES);
    }
    public void MiddleCostAnimalHome(IHomeBuilder builder) {
        builder.setConditioner(Availability.YES)
                .setDishwasher(Availability.NO)
                .setMicrowave(Availability.NO)
                .setTV(Availability.YES)
                .setFridge(Availability.YES)
                .setWashingMachine(Availability.NO)
                .setPetsAvailability(Availability.YES);
    }

    public void HighCostAnimalHome(IHomeBuilder builder) {
        builder.setConditioner(Availability.YES)
                .setDishwasher(Availability.YES)
                .setMicrowave(Availability.YES)
                .setTV(Availability.YES)
                .setFridge(Availability.YES)
                .setWashingMachine(Availability.YES)
                .setPetsAvailability(Availability.YES);
    }
}
