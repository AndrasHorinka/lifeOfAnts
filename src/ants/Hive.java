package ants;

import java.util.ArrayList;
import java.util.List;

public class Hive {
    final int NUMBER_OF_WORKERS = 5;
    final int NUMBER_OF_SOLDIERS = 2;
    final int NUMBER_OF_DRONES = 2;
    final int xBound = 500;
    final int yBound = 500;
    int[] xYLimits = new int[2];


    List<Worker> workers = new ArrayList<>();
    List<Soldier> soldiers = new ArrayList<>();
    List<Drone> drones = new ArrayList<>();
    Queen queen = Queen.getQueen();


    public void gameOn(int round) {
        for (Worker worker : workers) {
            System.out.println("...worker...");
            worker.nextRound(queen);
        }
        for (Soldier soldier : soldiers) {
            System.err.println("***SOLDIER***");
            soldier.nextRound(queen);
        }
        for (Drone drone : drones) {
            System.out.println("---drone---");
            if (drone.nextRound(queen, round)) {
                drone.spawn(xYLimits);
            }
        }
    }

    public void init() {
        xYLimits[0] = xBound;
        xYLimits[1] = yBound;

        queen.spawn(xYLimits);

        for (int i = 0; i < NUMBER_OF_WORKERS; i++) {
            Worker ant = new Worker(xYLimits);
            workers.add(ant);
        }
        for (int i = 0; i < NUMBER_OF_SOLDIERS; i++) {
            Soldier ant = new Soldier(xYLimits);
            soldiers.add(ant);
        }
        for (int i = 0; i < NUMBER_OF_DRONES; i++) {
            Drone ant = new Drone(xYLimits);
            drones.add(ant);
        }
    }
}
