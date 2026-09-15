import java.util.Scanner;

public class snake {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 5;
        int y = 5;

        System.out.println("🐍 MINI SNAKE GAME");
        System.out.println("W = Up | S = Down | A = Left | D = Right");
        System.out.println("X = Exit");

        while (true) {

            System.out.println("\nSnake position: (" + x + ", " + y + ")");
            System.out.print("Move: ");

            char move = sc.next().charAt(0);

            if (move == 'w') {
                y++;
            }
            else if (move == 's') {
                y--;
            }
            else if (move == 'a') {
                x--;
            }
            else if (move == 'd') {
                x++;
            }
            else if (move == 'x') {
                System.out.println("Game Over! 🐍");
                break;
            }
            else {
                System.out.println("Invalid move!");
            }
        }

        sc.close();
    }
}