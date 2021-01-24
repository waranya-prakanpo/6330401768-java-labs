package prakanpo.waranya.lab4;
import  java.util.Scanner;

public class GuessNumberGameV4 {
    static  int correctNum;
    static int min,max;
    static int maximum,minimum;
    static  int maxTries;
    static int[] guesses;
    static int numGuesses = 0;
    static int count = 0 ;

    public static void main(String[] args) {
        confiGame();
        genAnswer();
        playGames();
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
        guesses = new int[maxTries];//กำหนดของขนาดอาร์เรย์
    }
    public static void genAnswer() {
        correctNum = minimum + (int) (Math.random() * (maximum - minimum));
    }
    public static void showGuesses() {
            System.out.println(count); //แสดงรอบที่ใช้สุ่ม
                for (int i = 0; i < count; i++) {    //แสดงเลขที่สุ่มทั้งหมด
                    System.out.print(guesses[i] + " ");
                }
            System.out.println();
    }
    public static void showSpecific() {
        int x = 0;
        while (x < 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter which guess in range(1-" + maxTries + ")");
            int specific = sc.nextInt();
            int i = 0;
            while (1 <= specific && specific <= maxTries) {
                i++;
                if (specific == i + 1) {
                    System.out.println("Guess number " + specific + " is " + guesses[i]); //แสดงตัวเลขที่สุ่มตามลำดับที่เลือก
                    x =3 ;
                    break;
                }
            }
        }
    }
    public static void playGame() {
        while (true) {
            System.out.println("If want to play again? type 'y' to continue or 'q' to quit:" +               //ถามว่าต้องการเล่นต่อหรือออกจากเกม
                    "\nType 'a' to see all tour guesses or 'g' to see a guess on a specific play");          //ถามว่า ต้องการทราบเลขที่เราสุ่มไปทั้งหมดหรือไม่ หรือ ต้องการทราบเลขที่สุ่มโดยเจาะจงลำดับ
            Scanner sc = new Scanner(System.in);
            String continueOrquit = sc.next();
            if (continueOrquit.equals("y")) {
                genAnswer();
                playGames();
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
    public static void playGames() {
        for (int x = 1; x <= maxTries; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a guess (" + minimum + "-" + maximum + "):");
            numGuesses = sc.nextInt();
            guesses[x-1] = numGuesses;    //เก็บ numGuesses ใว้ในอาร์เรย์ของ guesses
            if (minimum <= numGuesses && numGuesses <= maximum) {
                count++;
                if (numGuesses < correctNum) {
                    System.out.println("Please type a higher number! Number of remaining tries:" + (maxTries - x));
                } else if (numGuesses > correctNum) {
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
        playGame();
    }
}


