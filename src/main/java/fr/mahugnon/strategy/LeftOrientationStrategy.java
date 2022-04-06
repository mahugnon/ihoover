package fr.mahugnon.strategy;


public class LeftOrientationStrategy extends OrientationStrategy {

    public LeftOrientationStrategy() {
        next.put('N',x-> setOrientation(x, 'W'));
        next.put('W',x-> setOrientation(x, 'S'));
        next.put('S',x-> setOrientation(x, 'E'));
        next.put('E',x-> setOrientation(x, 'N'));

    }
}
