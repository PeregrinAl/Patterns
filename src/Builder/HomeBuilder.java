package Builder;

import Builder.Components.Availability;

public class HomeBuilder implements IHomeBuilder {
    int bedsCount;
    Availability petsAvailability;
    Availability TV;
    Availability conditioner;
    Availability soundInsulation;
    Availability washingMachine;
    Availability fridge;
    Availability microwave;
    Availability dishwasher;

    @Override
    public IHomeBuilder setBedsCount(int count) {
        this.bedsCount = count;
        return this;
    }

    @Override
    public IHomeBuilder setPetsAvailability(Availability availability) {
        this.petsAvailability = availability;
        return this;
    }

    @Override
    public IHomeBuilder setTV(Availability availability) {
        this.TV = availability;
        return this;
    }

    @Override
    public IHomeBuilder setConditioner(Availability availability) {
        this.conditioner = availability;
        return this;
    }

    @Override
    public IHomeBuilder setSoundInsulation(Availability availability) {
        this.soundInsulation = availability;
        return this;
    }

    @Override
    public IHomeBuilder setWashingMachine(Availability availability) {
        this.washingMachine = availability;
        return this;
    }

    @Override
    public IHomeBuilder setFridge(Availability availability) {
        this.fridge = availability;
        return this;
    }

    @Override
    public IHomeBuilder setMicrowave(Availability availability) {
        this.microwave = availability;
        return this;
    }

    @Override
    public IHomeBuilder setDishwasher(Availability availability) {
        this.dishwasher = availability;
        return this;
    }

    @Override
    public Home build() {
        return new Home(bedsCount,
                petsAvailability,
                TV,
                conditioner,
                soundInsulation,
                washingMachine,
                fridge,
                microwave,
                dishwasher);
    }

}
