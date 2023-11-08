package car;

public class Ford extends BasicCar {
    public Ford(String model) {
        modelName = model;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}
