package iHoover.strategy;

import iHoover.core.Aspirator;

import java.util.HashMap;
import java.util.function.Function;

public abstract class   MovingStrategy {
    protected HashMap<Character, Function<Aspirator,Aspirator>> next =new HashMap<>();

    public abstract Aspirator execute(Aspirator aspirator);

}
