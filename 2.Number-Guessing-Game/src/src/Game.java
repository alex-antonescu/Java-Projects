import java.util.Random;
import java.util.Scanner;

public class Game {
    private int number;

    public Game() {
        Random random = new Random();
        number = random.nextInt(1, 100);
        random.nextInt();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Try & guess!");
        int guess = scanner.nextInt();
        boolean nrGhicit = false;
        while (!nrGhicit) {
            if (number < guess) {
                System.out.println("Nope, e mai mic");
                System.out.println("Try & guess, again!");
                guess = scanner.nextInt();
            }
            if (number > guess) {
                System.out.println("Nope, e mai mare");
                System.out.println("Try & guess, again!");
                guess = scanner.nextInt();
            }
            if (number == guess) {
                System.out.println("Suuuper, ai ghicit!");
                nrGhicit = true;
            }
        }
    }
}
