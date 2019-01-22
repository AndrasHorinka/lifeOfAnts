package ants;

public class Worker extends Ants {

    public Worker(int[] xyLimit) {
        spawn(xyLimit);
    }

    public void nextRound(Queen queen) {
        stepOne();
//        calculateDistanceToQueen(queen.getPosition());
    }
}
