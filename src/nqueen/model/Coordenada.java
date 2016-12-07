package nqueen.model;

/**
 * Created by matheus on 12/7/16.
 */
public class Coordenada {

    private int x;
    public int y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
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

    public String toString() {
        return "( " + x + ", " + y + " )";
    }
}
