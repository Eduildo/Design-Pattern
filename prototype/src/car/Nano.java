package car;

public class Nano extends BasicCard {
    public Nano(String model) {
        modelName = model;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano) super.clone();
    }

}
