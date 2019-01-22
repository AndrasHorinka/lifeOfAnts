package ants;

public class Soldier extends Ants {
    private boolean isSteppedRight = false;
    private boolean isSteppedLeft = false;
    private boolean isSteppedUp = false;
    private boolean isSteppedDown = false;

    public Soldier(int[] xyLimits) {
        spawn(xyLimits);
    }

    public void nextRound(Queen queen) {
        stepOne();
        calculateDistanceToQueen(queen.getPosition());
    }

    @Override
    public void stepOne() {
        if (isSteppedRight) {
            if (isSteppedUp) {
                if (isSteppedLeft) {
                    if (isSteppedDown) {
                        isSteppedRight = true;
                        isSteppedUp = true;
                        isSteppedLeft = true;
                        isSteppedDown = true;
                        position[0] += 1;
                    } else {
                        position[1] -= 1;
                    }
                } else {
                    position[0] -= 1;
                }
            } else {
                position[1] += 1;
            }
        } else {
            position[0] += 1;
        }
    }
}

