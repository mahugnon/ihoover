package iHoover.core;

public class Aspirator {
    private int x;
    private int y;
    private Character orientation;
    private Grille grille;


    public Aspirator(int x, int y, Character orientation, Grille grille) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        this.grille = grille;
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

    public Character getOrientation() {
        return orientation;
    }

    public void setOrientation(Character orientation) {
        this.orientation = orientation;
    }

    public  void  move(String instruction){
        MoveRequestHandler requestHandler = new MoveRequestHandler(grille);

        for (int i = 0; i <instruction.length(); i++) {
            requestHandler.move(this,instruction.charAt(i));
        }

    }
}
