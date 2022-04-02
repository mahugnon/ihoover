package iHoover.core;

import iHoover.strategy.ForwardStrategy;
import iHoover.strategy.LeftOrientationStrategy;
import iHoover.strategy.MovingStrategy;
import iHoover.strategy.RightOrientationStrategy;

import java.util.HashMap;
import java.util.Map;

public class MoveRequestHandler {
    private Map<Character, MovingStrategy> commands = new HashMap<>();

    public MoveRequestHandler(Grille grille) {
        commands.put('D',new RightOrientationStrategy());
        commands.put('G',new LeftOrientationStrategy());
        commands.put('A',new ForwardStrategy(grille));
    }

    public Aspirator move(Aspirator aspirator, Character instruction){
       return commands.get(instruction).execute(aspirator);
    }
}
