package prakanpo.waranya.lab5;

import java.util.Scanner;

public class GuessNumberGameVer1 {
    protected int minNum;
    protected int maxNum;
    protected int correctNum;
    protected int maxTries;
    protected int numOfGame = 0;

    GuessNumberGameVer1() {
        this.minNum = 1;
        this.maxNum = 10;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = 3;
        numOfGame++;
    }

    GuessNumberGameVer1(int minNum, int maxNum) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = 3;
        numOfGame++;
    }

    GuessNumberGameVer1(int minNum, int maxNum, int maxTries) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        numOfGame++;
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
            if (minNum <= randomNumber && randomNumber <= maxNum) {
                if (randomNumber < correctNum) {
                    System.out.println("Please type a higher number! Number of remaining tries:" + (maxTries - x));
                } else if (randomNumber > correctNum) {
                    System.out.println("Please type a lower number! Number of remaining tries:" + (maxTries - x));
                } else {
                    System.out.println("Congratulations! That’s correct");
                    System.exit(0);
                }
            } else {
                x--;
                System.out.println("The guess number must be in the range " + minNum + " and " + maxNum);
            }
        }
    }
    @Override
    public String toString() {
        String str = "GuessNumberGame with min number as " + minNum + " max number as " + maxNum + " max number of tries as " + maxTries;
        return str;

    }

    public static int getNumOfGame() {
        return getNumOfGame();

    }
}

