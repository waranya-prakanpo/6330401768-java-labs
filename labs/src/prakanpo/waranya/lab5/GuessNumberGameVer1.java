package prakanpo.waranya.lab5;

import java.util.Scanner;

public class GuessNumberGameVer1 {
    protected int minNum;
    protected int maxNum;
    protected int correctNum ;
    protected int maxTries; //รอบที่ใช้เล่นทั้งหมด
    protected static int numOfGames = 0;  //รอบที่ใช้เล่นจริง กรณีตอบถูกก่อนครบรอบ maxTries

    GuessNumberGameVer1() {
        minNum = 1;
        maxNum = 10;
        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        maxTries = 3;
        numOfGames++;
    }

    GuessNumberGameVer1(int minNum, int maxNum) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        maxTries = 3;
        numOfGames++;
    }

    GuessNumberGameVer1(int minNum, int maxNum, int maxTries) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        numOfGames++;
    }

    public int getMinNum() {
        return minNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getMaxTries() {
        return maxTries;
    }

    public void setMaxTries(int maxTries) {
        this.maxTries = maxTries;
    }

    public void playGame() {
        for (int x = 1; x <= maxTries; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
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

    @Override
    public String toString() {
        return "GuessNumberGame with min number as " + minNum + " max number as " + maxNum + " max number of tries as " + maxTries;
    }

    public static int getNumOfGames() {
        return numOfGames;
    }
}

