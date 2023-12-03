package flyweight;

public class Color {
    private String _name;
    private int _r;
    private int _g;
    private int _b;

    public Color(String name, int r, int g, int b) {
        this._name = name;
        this._r = r;
        this._g = g;
        this._b = b;
    }

    public void Draw(int x, int y, int radius) {
        System.out.println("Drawing a circle [" + x + " " + y + "] with radius " + radius);
    }
}
