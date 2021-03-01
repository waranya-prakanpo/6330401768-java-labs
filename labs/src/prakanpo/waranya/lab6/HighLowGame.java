package prakanpo.waranya.lab6;

public class HighLowGame extends DiceGame implements HasRule,UseDice{

    protected int numOfDice; //จำนวนลูกเต๋า
    int middleDice;  //ค่ากลางของลูกเต๋า

    public void setNumOfDice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public int getNumOfDice() {
        return numOfDice;
    }

    public HighLowGame() {
        gameName = "High-Low Game";
        numOfDice = 3;
        diceRoll = rollDice();
    }

    public HighLowGame(int numOfDice) {
        gameName = "High-Low Game";
        this.numOfDice = numOfDice;
        diceRoll = rollDice();
    }

    public HighLowGame(int numOfDice, String answer){
        gameName = "High-Low Game";
        this.answer = answer;
        this.numOfDice = numOfDice;
        diceRoll = rollDice();
    }

    @Override
    public String gameRules() {
        return null;
    }

    @Override
    public int rollDice() {
        int diceRoll = 0;
        for (int i = 0; i < numOfDice; i++) {
            int dice = (int) (Math.random() * maxAnswer + minAnswer); //สุ่มลูกเต๋า
            diceRoll = diceRoll + dice;
        }
        return diceRoll; // ส่งออกผลรวมของลูกเต๋าที่สุ่มได้
    }

    @Override
    public void playGame() {
        middleDice = (numOfDice*6 - numOfDice + 1)/2 + numOfDice - 1;
        if (answer.equalsIgnoreCase("l")){  //ถ้าผู้ใช้ป้อน l
            if (diceRoll < middleDice){   //ถ้า diceRoll < middleDice
                System.out.println("Congratulation! You win");
            }else {
                System.out.println("Sorry. you lose.");
            }
        } else if (answer.equalsIgnoreCase("h")){ //ถ้าผู้ใช้ป้อน h
            if (diceRoll >= middleDice){ //ถ้า  diceRoll >= middleDice
                System.out.println("Congratulation! You win");
            }else {
                System.out.println("Sorry. you lose.");
            }
        }
    }

    @Override
    public String toString(){
        return "Game name : " + this.gameName + ", Number of players : " + numOfPlayers + ", Dice roll : " + diceRoll +", player's guess : " + answer +" Number of dice is " + numOfDice;
    }
}
