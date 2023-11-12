package printer;

public class RGBPrint implements PrintDecorator {
    private PrintableObject wrappee;

    public void PrintingDecorator(PrintableObject wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getName() {
        return wrappee.getName() + " RGB print";
    }

    @Override
    public double getPrice() {
        return wrappee.getPrice() + 18;
    }
}
