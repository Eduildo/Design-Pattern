package trigonometry;

public class Circle {
    private double radius;

    public Circle(double radius, int x, int y, String color) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;

        }

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape xClone() {
        return new Circle(this);
        // return new Circle(this.radius this.getX(), this.getY(), this.getColor());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle) || !super.equals(obj))
            return false;
        Circle aux = (Circle) obj;
        return (aux.getRadius() == this.radius);
    }

}
