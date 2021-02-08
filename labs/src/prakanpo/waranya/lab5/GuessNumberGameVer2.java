package prakanpo.waranya.lab5;

import java.util.Scanner;

public class GuessNumberGameVer2 extends GuessNumberGameVer1 {
    protected int[] guesses; //เก็บเลขที่ผู้ใช้นำเข้ามา
    protected int numGuesses = 0;
    int MAX_GUESSES = 20;
    GuessNumberGameVer2() {
        super();
        guesses = new int[MAX_GUESSES];
    }

    GuessNumberGameVer2(int minNum, int maxNum) {
        super(minNum, maxNum);
        guesses = new int[MAX_GUESSES];
    }

    GuessNumberGameVer2(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
        guesses = new int[MAX_GUESSES];
    }

    @Override
    public void playGame() {
        numGuesses = 0;
        for (int x = 1; x <= maxTries; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
            int randomNumber = sc.nextInt();
            guesses[x - 1] = randomNumber;   //เก็บ randomNumber ใว้ในอาเรย์ guesses
            if (minNum <= randomNumber && randomNumber <= maxNum) {
                numGuesses++;
                if (randomNumber < correctNum) {
                    System.out.println("Please type a higher number! Number of remaining tries:" + (maxTries - x));
                } else if (randomNumber > correctNum) {
                    System.out.println("Please type a lower number! Number of remaining tries:" + (maxTries - x));
                } else {
                    System.out.println("Congratulations! That’s correct");
                    x = maxTries + 1;
                    break;
                }
            } else {
                x--;
                System.out.println("The guess number must be in the range " + minNum + " and " + maxNum);
            }
        }
    }

    public void showGuesses() {     //แสดงเลขที่ผู้ใช้เดาทั้งหมด
        for (int i = 0; i < numGuesses; i++) {
            System.out.print(guesses[i] + " ");
        }
        System.out.println();
    }

    public void showSpecific() {  //แสดงตัวเลขที่ผู้ใช้นำเขามา โดยเจาะจงลำดับ
        int x = 0;
        while (x < 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter which guess in range(1-" + numGuesses + ")");
            int specific = sc.nextInt();
            int i = 0;
            while (1 <= specific && specific <= maxTries) {
                i++;
                if (specific == i + 1) {
                    System.out.println("Guess number " + specific + " is " + guesses[i]);
                    x = 3;
                    break;
                }
            }
        }
    }

    public void playGames(){
        playGame();
        while (true) {
            System.out.println("If want to play again? type 'y' to continue or 'q' to quit:" +               //ถามว่าต้องการเล่นต่อหรือออกจากเกม
                    "\nType 'a' to see all tour guesses or 'g' to see a guess on a specific play");        //ถามว่า ต้องการทราบเลขที่เราสุ่มไปทั้งหมดหรือไม่ หรือ ต้องการทราบเลขที่สุ่มโดยเจาะจงลำดับ
            Scanner sc = new Scanner(System.in);
            String continueOrquit = sc.next();
            if (continueOrquit.equals("y")) {
                correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
                playGame();
            } else if (continueOrquit.equals("a")) {
                showGuesses();
            } else if (continueOrquit.equals("g")) {
                showSpecific();
            } else if (continueOrquit.equals("q")) {
                System.exit(0);
            } else {
                playGame();
            }
        }
    }
}
