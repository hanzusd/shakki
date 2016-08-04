
public class Ruutu {

    private int vertical;
    private int horizontal;

    public Ruutu(int x, int y) {
        this.vertical = y;
        this.horizontal = x;
    }

    public int getX() {
       return horizontal;
    }
    public int getY() {
        return vertical;
    }

    public String toString() {
        return "(" + vertical + ", " + horizontal + ")";
    }

}
