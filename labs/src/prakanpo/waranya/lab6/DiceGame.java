package prakanpo.waranya.lab6;

public class DiceGame extends Game{
    protected int diceRoll;  // ค่าลูกเต๋าที่รับค่าจากผู้เล่น
    protected String answer; //เฉลยค่าลูกเต๋าที่ random ออกมา
    int minAnswer = 1; //ค่าต่ำสุดของลูกเต๋า
    int maxAnswer = 6; //ค่าสูงสุดของลูกเต๋า

    public DiceGame(){ //เมื่อผู้เล่นไม่ป้อนค่าเข้ามาให้ถือว่าเฉลยค่าลูกเต๋าคือ l
        super("DiceGame",1);
        diceRoll = (int)(Math.random() * maxAnswer + minAnswer);
        this.answer = "l";
    }

    public DiceGame(String answer){ //เมื่อผู้ใช้ป้อนค่าเข้ามาให้ random เฉลย
        super("DiceGame",1);
        this.answer = answer;
        diceRoll = (int)(Math.random() * maxAnswer + minAnswer);
    }

    public int getDiceRoll(){
        return diceRoll;
    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Game name : " + this.gameName + ", Number of players : " + numOfPlayers + ", Dice roll : " + diceRoll + ", player's guess : " + answer;
    }

    @Override
    public void playGame() {
        if (answer.equals("l")){  //ถ้าผู้ใช้ป้อน l
            if (1 <= diceRoll && diceRoll <= 3){  //ตรวจสอบ 1 <= l <= 3 หรือไม่
                System.out.println("Congratulation! You win");
            }else {
                System.out.println("Sorry. you lose.");
            }
        } else if (answer.equals("h")){ //ถ้าผู้ใช้ป้อน h
            if (3 < diceRoll && diceRoll <= 6){ //ตรวจสอบ 3 < l <= 6 หรือไม่
                System.out.println("Congratulation! You win");
            }else {
                System.out.println("Sorry. you lose.");
            }
        }

    }
}
