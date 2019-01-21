package ants;

public class Worker extends Ants {

    public Worker(int xLimit, int yLimit) {
        spawn(xLimit, yLimit);
    }

    public void nextRound(Queen queen) {
        stepOne();
        calculateDistanceToQueen(queen.getPosition());
    }
}
