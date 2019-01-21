package ants;

public class Queen extends Ants {
    private int roundBetweenMatings = rand.nextInt(101) + 100;

    private boolean isInMatingMood = true;
    int roundOfLastMating;
    private static Queen instance = null;

    private Queen() {}

    public void nextRound(int round) {
        decideIfWannaMate(round);
    }

    public static Queen getQueen() {
        return instance;
    }

    @Override
    public void spawn(int xLimit, int yLimit) {
        if (instance == null) {
            instance = new Queen();
            int xCoord = rand.nextInt(xLimit + 1);
            int yCoord = rand.nextInt(yLimit + 1);
            setPosition(xCoord, yCoord);
        }
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


}
