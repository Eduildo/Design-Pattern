package printer;

public class Mug implements ObjetoEstampavel {
    private String _name;
    private double _price;

    public Mug() {
        _name = "Mug";
        _price = 20;
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }

}
