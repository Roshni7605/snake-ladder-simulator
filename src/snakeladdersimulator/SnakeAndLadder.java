package snakeladdersimulator;

public class SnakeAndLadder {

    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder Game!");

        Player player = new Player();
        Dice dice = new Dice();
        GameBoard board = new GameBoard();

        int diceRollCount = 0;

        while (player.getCurrentPosition() < 100){
            int diceValue = dice.rollDice();
            int option = dice.rollOption();
            diceRollCount++;

            switch (option){
                case 1:
                    System.out.println("No Play. Your current position is " + player.getCurrentPosition());
                    break;
                case 2:
                    int newPosition = player.getCurrentPosition() + diceValue;
                    newPosition = board.movePlayerOnBoard(newPosition);
                    if (newPosition <= 100) {
                        player.setCurrentPosition(newPosition);
                    }
                    System.out.println("You rolled a " + diceValue + ". Your current position is " + player.getCurrentPosition());
                    break;
                case 3:
                    int snakePosition = player.getCurrentPosition() - diceValue;
                    if (snakePosition < 0) {
                        snakePosition = 0;
                    }
                    System.out.println("Oops! You rolled a snake. Going back to position " + snakePosition + ".");
                    player.setCurrentPosition(snakePosition);
                    break;
            }
            
            System.out.println("Congratulations! You reached the target position of 100");
            System.out.println("Number of times the dice was played: " + diceRollCount);

        }

    }
}


