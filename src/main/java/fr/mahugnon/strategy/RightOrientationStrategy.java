package fr.mahugnon.strategy;

public class RightOrientationStrategy extends OrientationStrategy {

    public RightOrientationStrategy() {
        next.put('N',x-> setOrientation(x, 'E'));
        next.put('E',x-> setOrientation(x, 'S'));
        next.put('S',x-> setOrientation(x, 'W'));
        next.put('W',x-> setOrientation(x, 'N'));
    }

}
