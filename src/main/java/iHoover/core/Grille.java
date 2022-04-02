package iHoover.core;

public class Grille {
    private  int x;
    private  int y;

    public Grille(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isValidY(int y) {
        return y>=0 && y<= this.y;
    }

    public boolean isValidX(int x) {
        return  x>=0 && x<=this.x;
    }
}
