import java.util.Scanner;

public class Hand {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🎮 Rock Paper Scissors");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        System.out.print("Enter your choice: ");
        int player = sc.nextInt();

        int computer = (int)(Math.random() * 3) + 1;

        System.out.println("Computer chose: " + computer);

        if (player == computer) {
            System.out.println("Draw!");
        }
        else if ((player == 1 && computer == 3) ||
                 (player == 2 && computer == 1) ||
                 (player == 3 && computer == 2)) {
            System.out.println("You Win! 🎉");
        }
        else {
            System.out.println("Computer Wins! 😄");
        }

        sc.close();
    }
}