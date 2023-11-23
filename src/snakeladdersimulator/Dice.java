package snakeladdersimulator;

import java.util.Random;

public class Dice {

    Random random = new Random();

    /**
     * Rolling the Dice to get a random number
     * @return number between 1 to 6
     */
    public int rollDice() {
        return random.nextInt(6) + 1;
    }

    /**
     * Giving rolling options to the player
     * @return Options: 1 for No Play, 2 for Ladder, 3 for Snake
     */
    public int rollOption() {
        return random.nextInt(3) + 1;
    }
}
