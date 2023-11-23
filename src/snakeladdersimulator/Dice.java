package snakeladdersimulator;

import java.util.Random;

public class Dice {

    /**
     * Rolling the Dice to get a random number
     * @return number between 1 to 6
     */
    public int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
