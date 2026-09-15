import java.util.Random;
import java.util.Scanner;

public class luckynum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Enter a number (1-10): ");
        int user = sc.nextInt();

        int computer = r.nextInt(10) + 1;

        System.out.println("Your number: " + user);
        System.out.println("Computer number: " + computer);

        if (user == computer) {
            System.out.println("🍀 Lucky! You Win!");
        } else {
            System.out.println("Try Again!");
        }

        sc.close();
    }
}
