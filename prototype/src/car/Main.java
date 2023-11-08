package car;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BasicCar car_nano = new Nano("Nano Free");
        car_nano.price = 10000;

        BasicCar car_ford = new Ford("Ford Msutang");
        car_ford.price = 10000;

        BasicCar car2;

        car2 = car_nano.clone();
        car2.price = car_nano.price + BasicCar.setPrice();
        System.out.println("Car is: " + car2.modelName + " and it's price is Rs." + car2.price);

        car2 = car_ford.clone();
        car2.price = car_ford.price + BasicCar.setPrice();
        System.out.println("Car is: " + car2.modelName + " and it's price is Rs." + car2.price);

    }

}
