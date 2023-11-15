package flyweight;

//Context
public class Circulo {

    // flyweight
    private Color _color;
    // Unique state
    private int _x;
    private int _y;
    private int _radius;

    public Circulo(Color color, int x, int y, int radius) {
        this._color = color;
        this._x = x;
        this._y = y;
        this._radius = radius;
    }

    // operation
    public void Draw() {
        _color.Draw(_x, _y, _radius);
    }

}
