import java.util.Random;

public class Tinydice {
    public static void main(String[] args) {

        Random r = new Random();

        int player = r.nextInt(6) + 1;
        int computer = r.nextInt(6) + 1;

        System.out.println("🎲 Your Dice: " + player);
        System.out.println("🤖 Computer Dice: " + computer);

        if (player > computer)
            System.out.println("🎉 You Win!");
        else if (player < computer)
            System.out.println("😄 Computer Wins!");
        else
            System.out.println("🤝 Draw!");
    }
}