import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int numOfGuesses = 0;


        while (true) {
            System.out.println("Guess a number between 1-100!");
            int guess = Integer.valueOf(scanner.nextLine());
            if (guess == randomNumber) {
                numOfGuesses++;
                System.out.println("Congratulations! You guessed it in [" + numOfGuesses + "] attempts.");
                break;
            }
            if (guess < randomNumber) {
                System.out.println("Too low!");
                numOfGuesses++;
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
                numOfGuesses++;
            }
        }
    }



}