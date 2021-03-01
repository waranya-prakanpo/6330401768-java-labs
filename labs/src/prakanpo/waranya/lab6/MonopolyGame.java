package prakanpo.waranya.lab6;


import java.util.Arrays;

public class MonopolyGame extends DiceGame implements HasRule,UseDice,UseBoard{
    final int numOfDice = 2; //จำนวนลูกเต่า
    protected int[] cash = new int[8] ;

    public  MonopolyGame() {
        numOfPlayers = 2;
        gameName = "Monopoly Game";
        getCash();

    }
    public MonopolyGame(int numOfPlayers){
        this.numOfPlayers = numOfPlayers;
        gameName = "Monopoly Game";
        getCash();
    }

    @Override
    public String gameRules() {
        return null;
    }

    @Override
    public void setUpBoard() {
        System.out.println("Setting up monopoly board");
    }

    @Override
    public int rollDice() {
        int diceRoll = 0;
        for (int i = 0; i < numOfDice; i++) {
            int dice = (int) (Math.random() * maxAnswer + minAnswer); //สุ่มค่าลูกเต๋า
            diceRoll = diceRoll + dice;
        }
        return diceRoll;
    }

    @Override
    public void playGame() {
        System.out.println("Playing Monopoly Game");
    }

    @Override
    public String toString(){
        return "Game name : " + this.gameName + ", Number of players : " + numOfPlayers;
    }

    public String getCash() {
        String showCash = " ";
        for (int i = 0; i < numOfPlayers; i++) {
            cash[i] = 1500;
            showCash += cash[i] + " "; // 1500 1500 1500
            }
        return showCash;
    }

    public void setCash(int[] cash) {
        this.cash = cash;
    }
}
