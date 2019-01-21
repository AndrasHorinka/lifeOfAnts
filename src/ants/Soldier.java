package ants;

public class Soldier extends Ants {
    private boolean isSteppedRight = false;
    private boolean isSteppedLeft = false;
    private boolean isSteppedUp = false;
    private boolean isSteppedDown = false;

    public Soldier(int xLimit, int yLimit) {
        spawn(xLimit, yLimit);
    }

    public void nextRound(Queen queen) {
        stepOne();
        calculateDistanceToQueen(queen.getPosition());
    }

    @Override
    public void stepOne() {
        boolean stepMade = false;
        int step;

        while (!stepMade) {
            boolean isStepInXAxis = rand.nextBoolean();
            boolean isStepPositive = rand.nextBoolean();

            if (isStepInXAxis) {
                if (isStepPositive) {
                    if (!isSteppedRight) {
                        isSteppedRight = true;
                        position[0] += 1;
                        stepMade = true;
                    } else if (!isSteppedLeft) {
                        isSteppedLeft = true;
                        position[0] -= 1;
                        stepMade = true;
                    }
                } else {
                    if (!isSteppedLeft) {
                        isSteppedLeft = true;
                        position[0] -= 1;
                        stepMade = true;
                    } else if (!isSteppedRight) {
                        isSteppedRight = true;
                        position[0] += 1;
                        stepMade = true;
                    }
                }
            } else {
                if (isStepPositive) {
                    if (!isSteppedUp) {
                        isSteppedUp = true;
                        position[1] += 1;
                        stepMade = true;
                    } else if (!isSteppedDown) {
                        isSteppedDown = false;
                        position[1] -= 1;
                        stepMade = true;
                    }
                } else {
                    if (!isSteppedDown) {
                        isSteppedDown = true;
                        position[1] -= 1;
                        stepMade = true;
                    } else if (!isSteppedUp) {
                        isSteppedUp = true;
                        position[1] += 1;
                        stepMade = true;
                    }
                }
            }
        }
    }
}

