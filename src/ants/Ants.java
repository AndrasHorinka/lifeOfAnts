package ants;

import java.util.Random;

public abstract class Ants {
    public int[] position = new int[2];
    public int distanceToQueen;
    public Random rand = new Random();

    public int getDistanceToQueen() {
        return distanceToQueen;
    }

    public void calculateDistanceToQueen(int[] queenCoords) {
        distanceToQueen = Math.abs(queenCoords[0]-position[0]) + Math.abs(queenCoords[1] - position[1]);
    }

    public void spawn(int xLimit, int yLimit) {
        int xCoord = rand.nextInt(xLimit+1);
        int yCoord = rand.nextInt(yLimit+1);
        setPosition(xCoord,yCoord);
    }

    public void setPosition(int x, int y) {
        this.position[0] = x;
        this.position[1] = y;
    }

    public void stepOne() {
        boolean isStepInXAxis = rand.nextBoolean();
        boolean isStepPositive = rand.nextBoolean();
        int step;
        if (isStepPositive) {
            step = 1;
        } else {
            step = -1;
        }

        if (isStepInXAxis) {
            position[0] += step;
        } else {
            position[1] += step;
        }
    }

    public int[] getPosition() {
        return position;
    }
}
