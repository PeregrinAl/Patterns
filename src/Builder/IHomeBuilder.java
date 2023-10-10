package Builder;

import Builder.Components.Availability;

public interface IHomeBuilder {
    IHomeBuilder setBedsCount(int count);
    IHomeBuilder setPetsAvailability(Availability availability);
    IHomeBuilder setTV(Availability availability);
    IHomeBuilder setConditioner(Availability availability);
    IHomeBuilder setSoundInsulation(Availability availability);
    IHomeBuilder setWashingMachine(Availability availability);
    IHomeBuilder setFridge(Availability availability);
    IHomeBuilder setMicrowave(Availability availability);
    IHomeBuilder setDishwasher(Availability availability);
    Home build();

}
