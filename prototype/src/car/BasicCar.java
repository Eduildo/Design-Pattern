package car;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
    public String modelName;
    public double price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public static double setPrice() {
        double price = 0;
        Random r = new Random();
        double p = r.nextInt(10000);
        price = p;
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
