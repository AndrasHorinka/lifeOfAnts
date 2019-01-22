package ants;

public class Drone extends Ants {
    private int roundOfLastMating;
    private boolean isMated = false;


    public Drone(int[] xyLimits) {
        spawn(xyLimits);
    }

    public boolean nextRound(Queen queen, int round) {
        stepOne();
        calculateDistanceToQueen(queen.getPosition());
        if (distanceToQueen <= 3) {
            if (mating(queen, round)) {
                return true;
            }
        }
        return false;
    }

    private boolean mating(Queen queen, int round) {
        if (!isMated) {
            if (queen.isMating()) {
                queen.setRoundOfLastMating(round);
                setRoundOfLastMating(round);
                setIsMated(true);
                System.out.println("HALLELUJAH");
            } else {
                System.err.printf("D'OH");
                return false;
            }
        } else {
            if (round - 10 > roundOfLastMating) {
                return false;
            }
        }
        return true;
    }

    private void setRoundOfLastMating(int round) {
        this.roundOfLastMating = round;
    }


    private void setIsMated(boolean mated) {
        this.isMated = mated;
    }
}
