package prakanpo.waranya.lab7;
import prakanpo.waranya.lab6.*;
import java.util.ArrayList;

public class TestInterfaceAsType {
    public static int compareRollDice(DiceGame g1, DiceGame g2) {
        if (g1.getDiceRoll() < g2.getDiceRoll()) { //ถ้า game(i) น้อยกว่า game(i+1) ให้ส่งออกค่าน้อยกว่า
            return -1;
        } else if (g1.getDiceRoll() > g2.getDiceRoll()) { //ถ้า game(i) มากกว่า game(i+1) ให้ส่งออกค่ามากกว่า
            return 1;
        } else { // ส่งออกว่า game(i) เท่ากับ game(i+1)
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<UseDice> games = new ArrayList<UseDice>();
        games.add(new HighLowGame());
        games.add(new HighLowGame(3));
        games.add(new HighLowGame(4,"h"));
        games.add(new MonopolyGame());
        games.add(new MonopolyGame(3));
        for (int i = 0; i<=3; i++){
            int firstGame = ((DiceGame) games.get(i)).getDiceRoll(); //ให้ค่าของ games(i) = Game(i) เก็บในตัวแปร firstGame
            int secondGame = ((DiceGame) games.get(i+1)).getDiceRoll(); //ให้ค่าของ games(i+1) = Game(i+1) เก็บในตัวแปร secondGame
            int returnDice = games.get(i).rollDice();  //ให้ games(i) = ค่า rollDice เก็บในตัวแปร returnDice

            if (compareRollDice((DiceGame) games.get(i), (DiceGame) games.get(i+1)) == -1 ) { //ถ้า Game(i) น้อยกว่า game(i+1)
                System.out.println("Game(" + i + ") : " + firstGame  + " has dice roll less than " + "Game(" + (1 + i) + ") : " + secondGame);
                System.out.println("Game(" + i + ") : " + "rollDice method returns " + returnDice );
            } else if (compareRollDice((DiceGame) games.get(i), (DiceGame) games.get(i+1)) == 1 ) { //ถ้า Game(i) มากกว่า game(i+1)
                System.out.println("Game(" + i + ") : " + firstGame + " has dice roll greater than " + "Game(" + (1 + i) + ") : " +  secondGame) ;
                System.out.println("Game(" + i + ") : " + "rollDice method returns " + returnDice);
            } else { //ถ้าไม่ใช่ทั้ง 2 เงื่อนไขด้านบน
                System.out.println("Game(" + i + ") : " + firstGame + " has dice roll equal to " + "Game(" + (1 + i) + ") : " +  secondGame);
                System.out.println("Game(" + i + ") : " + "rollDice method returns " + returnDice);
            }

        }
    }
}


