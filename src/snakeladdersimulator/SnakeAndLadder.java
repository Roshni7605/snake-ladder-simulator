package snakeladdersimulator;

public class SnakeAndLadder {

    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder Game!");

        Player player1 = new Player();
        Player player2 = new Player();
        Dice dice = new Dice();
        GameBoard board = new GameBoard();

        int diceRollCount = 0;
        int currentPlayer = 1;

        while (player1.getCurrentPosition() < 100 && player2.getCurrentPosition() < 100){
            Player currentPlayerObj = (currentPlayer == 1) ? player1 : player2;

            int diceValue = dice.rollDice();
            int option = dice.rollOption();
            diceRollCount++;

            switch (option){
                case 1:
                    System.out.println("No Play. Player " + currentPlayer + "'s current position is "
                            + currentPlayerObj.getCurrentPosition());
                    break;
                case 2:
                    int newPosition = currentPlayerObj.getCurrentPosition() + diceValue;
                    newPosition = board.movePlayerOnBoard(newPosition);
                    if (newPosition <= 100) {
                        currentPlayerObj.setCurrentPosition(newPosition);
                    }
                    System.out.println("Player " + currentPlayer + " rolled a " + diceValue + ". Current position is "
                            + currentPlayerObj.getCurrentPosition());
                    break;
                case 3:
                    int snakePosition = currentPlayerObj.getCurrentPosition() - diceValue;
                    if (snakePosition < 0) {
                        snakePosition = 0;
                    }
                    System.out.println("Player " + currentPlayer + " rolled a snake. Going back to position "
                            + snakePosition + ".");
                    currentPlayerObj.setCurrentPosition(snakePosition);
                    break;
            }

            // Switch to the next player only if the option is not a ladder
            if (option != 2) {
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }

            if (player1.getCurrentPosition() == 100) {
                System.out.println("Player 1 won the game!");
            } else {
                System.out.println("Player 2 won the game!");
            }
        }

    }
}


