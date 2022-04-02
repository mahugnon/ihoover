package iHoover.strategy;

import iHoover.core.Aspirator;
import iHoover.core.Grille;

public class ForwardStrategy extends MovingStrategy {
    private Grille grille;

    public ForwardStrategy(Grille grille) {
        this.grille = grille;
        next.put('N',(x)-> this.moveForwardToNorth(x));
        next.put('E',(x)->this.moveForwardEast(x));
        next.put('S',(x)->this.moveForwardSouth(x));
        next.put('W',(x)->this.moveForwardWest(x));
    }

    public Grille getGrille() {
        return grille;
    }

    @Override
    public Aspirator execute(Aspirator aspirator) {

        return next.get(aspirator.getOrientation()).apply(aspirator);
    }

    private Aspirator moveForwardWest(Aspirator aspirator) {
        int newXPos = aspirator.getX()-1;
        setAspiratorXPos(aspirator, newXPos);
        return aspirator;
    }

    private Aspirator moveForwardSouth(Aspirator aspirator) {
        int newYPos = aspirator.getY()-1;
        setAspiratorYPos(aspirator, newYPos);
        return aspirator;
    }


    private Aspirator moveForwardEast(Aspirator aspirator) {
        int newXPos = aspirator.getX()+1;
        setAspiratorXPos(aspirator, newXPos);
        return aspirator;
    }
    private Aspirator moveForwardToNorth(Aspirator aspirator) {
        int newYPos = aspirator.getY()+1;
        setAspiratorYPos(aspirator, newYPos);
        return aspirator;
    }


    private void setAspiratorYPos(Aspirator aspirator, int newYPos) {
        if (this.getGrille().isValidY(newYPos)) {
            aspirator.setY(newYPos);
        }
    }
    private void setAspiratorXPos(Aspirator aspirator, int newXPos) {
        if ( this.getGrille().isValidY(newXPos)){
            aspirator.setX(newXPos);
        }
    }


}
