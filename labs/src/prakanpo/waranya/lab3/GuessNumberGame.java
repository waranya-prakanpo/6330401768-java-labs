package prakanpo.waranya.lab3;
import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt((10 - 1) + 1) + 1;
        int maxTries = 3; //รอบในการเล่น
        int a;
        for (a = 1; a <= maxTries; a++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a guess (1-10):");
            int randomNumber = sc.nextInt();
            if (randomNumber < value) {
                System.out.println("Please type a higher number! Number of remaining tries:" + (maxTries - a));
            } else if (randomNumber > value) {
                System.out.println("Please type a lower number! Number of remaining tries:" + (maxTries - a));
            } else {
                System.out.println("Congratulations! That’s correct");
                break;
            }
        }
    }
}
