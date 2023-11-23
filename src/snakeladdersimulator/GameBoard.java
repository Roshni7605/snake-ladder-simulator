package snakeladdersimulator;

import java.util.HashMap;
import java.util.Map;

public class GameBoard {

    private final Map<Integer, Integer> snakeAndLadder;

    public GameBoard() {
        this.snakeAndLadder = new HashMap<>();
        boardCreation();
    }

    /**
     * Define Snake and Ladder on Board
     */
    private void boardCreation(){
        snakeAndLadder.put(14, 8);
        snakeAndLadder.put(27, 19);
        snakeAndLadder.put(35, 22);
        snakeAndLadder.put(49, 11);
        snakeAndLadder.put(72, 92);
        snakeAndLadder.put(85, 98);
        snakeAndLadder.put(99, 63);
    }

    /**
     * Based on players position, player will move to forward, backward or staying on the same position.
     * @param currentPosition player's current position
     * @return next move
     */
    public int movePlayerOnBoard(int currentPosition){
        if (snakeAndLadder.containsKey(currentPosition)){
            int nextPosition = snakeAndLadder.get(currentPosition);
            if (nextPosition < currentPosition){
                System.out.println();
            }else {
                System.out.println();
            }
            return nextPosition;
        }
        return currentPosition;
    }

}
