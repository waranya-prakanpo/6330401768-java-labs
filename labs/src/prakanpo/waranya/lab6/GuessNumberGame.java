package prakanpo.waranya.lab6;

import prakanpo.waranya.lab5.GuessNumberGameVer1;

import java.util.Scanner;

public class GuessNumberGame extends Game {
    protected int minNum;  //ค่าต่ำสุดของเลขสุ่ม
    protected int maxNum;  //ค่าสูงสุดของเลขสุ่ม
    protected int correctNum;  //เฉลย
    protected int maxTries;  //จำนวนรอบทีสูงสุด่สามารถเล่นได้
    static protected int numOfGames = 0; //จำนวนการเล่นจริง

    public GuessNumberGame(){
        super("Guess Number Game",1);
        this.minNum = 1;
        this.maxNum = 10;
        this.maxTries = 3;
        numOfGames++;
    }

    public GuessNumberGame(int minNum, int maxNum){
        super("Guess Number Game",1);
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = 3;
        numOfGames++;
    }

    public GuessNumberGame(int minNum, int maxNum, int maxTries){
        super("Guess Number Game",1);
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
        numOfGames++;
    }

    public int getMinNum(){
        return minNum;
    }

    public void setMinNum(int minNum){
        this.minNum = minNum;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum){
        this.maxNum = maxNum;
    }

    public int getMaxTries(){
        return maxTries;
    }

    public void setMaxTries(int maxTries){
        this.maxTries = maxTries;
    }

    @Override
    public void playGame() {
        for (int x = 1; x <= maxTries; x++) {  //กำหนดจำนวนรอบในการเล่น เริ่มที่ x = 1 หยุดที่ x = maxTries โดย x เพิ่มขึ้นทีละ 1
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
            int randomNumber = sc.nextInt(); //รับเลขสุ่มจากผู้ใช้
            if (randomNumber < correctNum) {   //ตรวจสอบว่า ถ้าเลขสุ่มที่ผู้ใช้ป้อนเข้ามาน้อยกว่าเฉลยให้ทำตามเงื่อนไขนี้
                System.out.println("Please type a higher number! Number of remaining tries:" + (maxTries - x));
            } else if (randomNumber > correctNum) {  //ตรวจสอบว่า ถ้าเลขสุ่มที่ผู้ใช้ป้อนเข้ามามีค่ามากกว่าเฉลยให้ทำตามเงื่อนไขนี้
                System.out.println("Please type a lower number! Number of remaining tries:" + (maxTries - x));
            } else { //ถ้าไม่ใช่ทั้ง 2 เงื่อนไขด้านบน ให้ทำตามเงื่อนไขนี้
                System.out.println("Congratulations! That’s correct");
                break;
            }
        }
    }

    @Override
    public String toString(){
        return "Game name : " + this.gameName + ", Number of players : " + numOfPlayers + ", Min is " + minNum + ", Max is " + maxNum + ", Number of tries is " + maxTries;
    }
}
