package iHoover.strategy;

import iHoover.core.Aspirator;

public class OrientationStrategy extends MovingStrategy {

     Aspirator setOrientation(Aspirator x, char orientation) {
        x.setOrientation(orientation);
        return x;
    }
    @Override
    public Aspirator execute(Aspirator aspirator) {
        return next.get(aspirator.getOrientation()).apply(aspirator);
    }
}
