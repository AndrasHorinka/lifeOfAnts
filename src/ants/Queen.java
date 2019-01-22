package ants;

public class Queen extends Ants {
    private int roundBetweenMatings = rand.nextInt(101) + 100;

    private boolean isInMatingMood = true;
    int roundOfLastMating;
    private static Queen instance = null;

    private Queen() {
    }

    public void nextRound(int round) {
        decideIfWannaMate(round);
    }

    public static Queen getQueen() {
        if (Queen.instance == null) {
            Queen.instance = new Queen();
        }
        return Queen.instance;
    }

    private void decideIfWannaMate(int round) {
        if (round - roundBetweenMatings < roundOfLastMating) {
            isInMatingMood = true;
        } else {
            isInMatingMood = false;
        }
    }

    public boolean isMating() {
        return isInMatingMood;
    }

    public void setRoundOfLastMating(int roundOfLastMating) {
        this.roundOfLastMating = roundOfLastMating;
    }
}
