import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("🎮 NUMBER GUESSING GAME");
        System.out.println("Guess a number between 1 and 100!");

        while (true) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("🎉 Correct!");
                System.out.println("You guessed it in " + attempts + " attempts.");
                break;
            }
            else if (guess < secretNumber) {
                System.out.println("📈 Too low! Try a bigger number.");
            }
            else {
                System.out.println("📉 Too high! Try a smaller number.");
            }
        }

        sc.close();
    }
}