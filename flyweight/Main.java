import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Circulo> _objects = new ArrayList<>();
        

        _objects.add(new Circle(ColorFactory.getColor("red"), 10, 20, 300));
        _objects.add(new Circle(ColorFactory.getColor("red"), 10, 20, 300));
        _objects.add(new Circle(ColorFactory.getColor("black"), 10, 20, 100));
        _objects.add(new Circle(ColorFactory.getColor("red"), 10, 20, 300));
        _objects.add(new Circle(ColorFactory.getColor("black"), 15, 20, 70));
        _objects.add(new Circle(ColorFactory.getColor("red"), 10, 77, 10));
        _objects.add(new Circle(ColorFactory.getColor("red"), 10, 60, 7));
        _objects.add(new Circle(ColorFactory.getColor("red"), 10, 20, 300));
        _objects.add(new Circle(ColorFactory.getColor("red"), 10, 20, 300));
        

    }

}
