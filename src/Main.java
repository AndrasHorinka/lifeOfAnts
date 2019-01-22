import ants.*;

public class Main {
    static final int NUMBER_OF_ROUNDS = 10;

    public static void main(String[] args) {
        Hive game = new Hive();
        game.init();

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("-----------------------------------------");
            System.out.println("Round: " + i);
            game.gameOn(i);
        }

    }

}
