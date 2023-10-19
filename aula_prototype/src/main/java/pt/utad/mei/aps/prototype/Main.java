package pt.utad.mei.aps.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        // List<Shape> shapesCopy = new ArrayList<Shape>();

        Circle c1 = new Circle(10, 6, 6, "Red");
        shapes.add(c1);
        Circle c2 = (Circle) c1.Clone();
        c2.setRadius(20);
        shapes.add(c2);

        if (c1.equals(c2)) {
            System.out.println("Circle 1 and  Circle 2 are identical");
        } else {
            System.out.println("Circle 1 and  Circle 2 are not identical");
        }

        Circle c3 = (Circle) c2.Clone();
        shapes.add(c3);
        System.out.println("C3: " + c3.hashCode() + " == c2: " + c3.equals(c2));
        System.out.println("C3: " + c3.hashCode() + " == c1: " + c3.equals(c1));

    }
}