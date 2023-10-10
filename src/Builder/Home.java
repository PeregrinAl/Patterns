package Builder;

import Builder.Components.Availability;

public class Home {
    String address;
    int bedsCount;
    Availability petsAvailability;
    Availability TV;
    Availability conditioner;
    Availability soundInsulation;
    Availability washingMachine;
    Availability fridge;
    Availability microwave;
    Availability dishwasher;

    public Home(int count, Availability availability, Availability tv, Availability conditioner, Availability soundInsulation, Availability washingMachine, Availability fridge, Availability microwave, Availability dishwasher) {
    }

    public String getAddress() {
        return address;
    }

    public int getBedsCount() {
        return bedsCount;
    }

    public Availability getPetsAvailability() {
        return petsAvailability;
    }

    public Availability getTV() {
        return TV;
    }

    public Availability getConditioner() {
        return conditioner;
    }

    public Availability getFridge() {
        return fridge;
    }

    public Availability getMicrowave() {
        return microwave;
    }

    public Availability getSoundInsulation() {
        return soundInsulation;
    }

    public Availability getWashingMachine() {
        return washingMachine;
    }

    public Availability getDishwasher() {
        return dishwasher;
    }
}
