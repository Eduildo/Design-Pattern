package pt.utad.mei.aps.decorator;

public class Mug implements ObjetoEstampavel {
    private String _name;
    private double _price;

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }

}
