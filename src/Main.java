import ants.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Ants> workers = new ArrayList<>();
    List<Ants> soldiers = new ArrayList<>();
    List<Ants> drones = new ArrayList<>();
    Queen queen;

    final int NUMBER_OF_WORKERS = 20;
    final int NUMBER_OF_SOLDIERS = 10;
    final int NUMBER_OF_DRONES = 10;
    final int xBound = 500;
    final int yBound = 500;



    public static void main(String[] args) {
        Main game = new Main();
        game.init();


    }

    private void init() {
        queen = Queen.getQueen();

        for (int i = 0; i < NUMBER_OF_WORKERS; i++) {
            Ants ant = new Worker(xBound, yBound);
            workers.add(ant);
        }
        for (int i = 0; i < NUMBER_OF_SOLDIERS; i++) {
            Ants ant = new Soldier(xBound, yBound);
            soldiers.add(ant);
        }
        for (int i = 0; i < NUMBER_OF_DRONES; i++) {
            Ants ant = new Drone(xBound, yBound);
            drones.add(ant);
        }
    }
}
