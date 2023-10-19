package pt.utad.mei.aps.objectpool;

public class Ponto {
    private int y;
    private int x;

    public Ponto(int y, int x) {
        this.x = x;
        this.y = y;
    }

    public Ponto() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
