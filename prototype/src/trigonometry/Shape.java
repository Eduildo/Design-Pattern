package trigonometry;

abstract class Shape {

    private int x;
    private int y;
    private String color;

    public Shape(Shape target) {
        this.x = target.getX();
        this.y = target.getY();
        this.color = target.getColor();
    }

    public Shape(int x2, int y2, String color2) {
        this.x = x2;
        this.y = y2;
        this.color = color2;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape))
            return false;
        Shape aux = (Shape) obj;
        return (this.getX() == aux.getX())
                && (this.getY() == aux.getY())
                && this.getColor().equals(aux.getColor());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public abstract Shape Clone();

}
