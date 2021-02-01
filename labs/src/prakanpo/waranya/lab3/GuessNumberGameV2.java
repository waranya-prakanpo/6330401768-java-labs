package prakanpo.waranya.lab3;
import java.util.Random;
import  java.util.Scanner;

public class GuessNumberGameV2 {
    static  int correctNum;
    static int minNum = 1, maxNum = 10;
    public static void main(String[] args) {
        genAnswer();
        playGame();
    }

    public static void genAnswer() {
        Random rand = new Random();
        correctNum = rand.nextInt((maxNum - minNum) + 1) + minNum;
    }

    public static void playGame() {
        int maxTries = 3; //รอบในการเล่น
        for (int x = 1; x <= maxTries; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a guess (1-10):");
            int randomNumber = sc.nextInt();
            if (randomNumber < correctNum) {
                System.out.println("Please type a higher number! Number of remaining tries:" + (maxTries - x));
            } else if (randomNumber > correctNum) {
                System.out.println("Please type a lower number! Number of remaining tries:" + (maxTries - x));
            } else {
                System.out.println("Congratulations! That’s correct");
                break;
            }
        }

    }
}
