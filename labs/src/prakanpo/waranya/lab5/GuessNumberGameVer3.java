package prakanpo.waranya.lab5;

import java.util.Scanner;

public class GuessNumberGameVer3 extends GuessNumberGameVer2{
    public GuessNumberGameVer3(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
        guesses = new int[MAX_GUESSES];
    }

    public void guessAverage() {   //แสดงค่าเฉลี่ยของเลขที่สุ่ม
        int num = 0;
        for (int i = 0; i<numGuesses; i++){
            num += guesses[i] ;
        }
        Double doubleCount = new Double(numGuesses);
        Double doubleNum=new Double(num);
        System.out.println("Average = " + doubleNum/doubleCount);
    }

    public  void guessMin(){   //แสดงค่าน้อยที่สุดของเลขที่สุ่ม
        int least = guesses[0];
        for (int i = 0;i<numGuesses;i++){
            if(guesses[i] < least){
                least = guesses[i];
            }
        }
        System.out.println("Min = " + least);
    }

    public void guessMax(){   //แสดงค่ามากที่สุดของเลขที่สุ่ม
        int most = guesses[0];
        for (int i = 0;i<numGuesses;i++){
            if(guesses[i] > most){
                most = guesses[i];
            }
        }
        System.out.println("Max = " + most);
    }

    @Override
    public void playGame() {
        numGuesses = 0;
        for (int x = 1; x <= maxTries; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
            int randomNumber = sc.nextInt();
            guesses[x - 1] = randomNumber;
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

    public void playGames(){
        playGame();
        while (true) {
            System.out.println("If want to play again? type 'y' to continue or 'q' to quit:" +               //ถามว่าต้องการเล่นต่อหรือออกจากเกม
                    "\nType 'a' to see all tour guesses or 'g' to see a guess on a specific play" +          //ถามว่า ต้องการทราบเลขที่เราสุ่มไปทั้งหมดหรือไม่ หรือ ต้องการทราบเลขที่สุ่มโดยเจาะจงลำดับ
                    "\nType 'v' to see average or 'm' to see minimum or 'x' to see maximum of all your guesses ");
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
            }
            else if(continueOrquit.equals("v")){
                guessAverage();
            } else if(continueOrquit.equals("m")) {
                guessMin();
            } else if (continueOrquit.equals("x")) {
                guessMax();
            } else {
                playGame();
            }
        }
    }

}
