package prakanpo.waranya.lab3;
import java.util.Random;
import  java.util.Scanner;

public class GuessNumberGameV3 {
    static  int correctNum;
    static int min,max;
    static int maximum,minimum;
    static  int maxTries;
    static int randomNumber;
    public static void main(String[] args) {
        confiGame();
        genAnswer();
        playGame();
    }
    public static void confiGame() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the min and the max values:");
        min = sc.nextInt();
        max  = sc.nextInt();
        minimum = Math.min(min,max); //กำหนดตัวเลขต่ำสุดที่ใช้ในการสุ่มเลข
        maximum = Math.max(min,max); //กำหนดตัวเลขสูงุดที่ใช้ในการสุ่มเลข
        System.out.print("Enter the number of tries:");
        maxTries = sc.nextInt(); //กำหนดรอบในการเล่น
    }
    public static void genAnswer() {
        Random rand = new Random();
        correctNum = rand.nextInt((maximum - minimum) + 1) + minimum;
    }
    public static void playGame() {
        for (int x = 1; x <= maxTries; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a guess (" + minimum + "-" + maximum + "):");
            int randomNumber = sc.nextInt();
            if (minimum <= randomNumber && randomNumber <= maximum) {
                if (randomNumber < correctNum) {
                    System.out.println("Please type a higher number! Number of remaining tries:" + (maxTries - x));
                } else if (randomNumber > correctNum) {
                    System.out.println("Please type a lower number! Number of remaining tries:" + (maxTries - x));
                } else {
                    System.out.println("Congratulations! That’s correct");
                    break;
                }
            } else {
                x--;
                System.out.println("The guess number must be in the range " + minimum + " and " + maximum);
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("If want to play again? type 'y' to continue or 'q' to quit:");
        String continueOrquit = sc.next();
        if(continueOrquit.equals("y")){
            genAnswer();
            playGame();
        }
        else {
            System.exit(0);
        }
    }
}