package fr.mahugnon.core;

import fr.mahugnon.strategy.ForwardStrategy;
import fr.mahugnon.strategy.LeftOrientationStrategy;
import fr.mahugnon.strategy.MovingStrategy;
import fr.mahugnon.strategy.RightOrientationStrategy;

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
