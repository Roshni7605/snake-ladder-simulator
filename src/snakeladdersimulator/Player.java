package snakeladdersimulator;

public class Player {

    private int currentPosition;

    public Player() {
        this.currentPosition = 0;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
