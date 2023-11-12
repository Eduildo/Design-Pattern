package printer;

public class Tshirt implements ObjetoEstampavel {
    private String _name;
    private double _price;

    public Shirt(){
        name = "Shirt";
        price = 25;
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public double getPrice() {
        return _price;
    }
}
