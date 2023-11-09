package pt.utad.mei.aps.decorator;

public class Tshirt implements ObjetoEstampavel {
    private String _name;
    private double _price;

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public double getPrice() {
        return _price;
    }
}
