package prakanpo.waranya.lab6;

import java.util.Scanner;

public abstract class Game {
    protected String gameName;   //ชื่อเกม
    protected int numOfPlayers;  // รอบในการเล่น

    public Game(){
        this.gameName = "unknown game";
        numOfPlayers = 0;
    }

    public  Game(String gameName, int numOfPlayers) {
        this.gameName = gameName;
        this.numOfPlayers = numOfPlayers;
    }

    public String getGameName() {
        return getGameName();
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers){
        this.numOfPlayers = numOfPlayers;
    }

    @Override
    public String toString() {
        return "Game name : " + this.gameName + ", Number of plays : " + numOfPlayers ;
    }

    public abstract void playGame(); //เพื่อบังคับว่า ถ้า class อื่นมา extends class นี้ไป ต้องมี method playGame เป็นของตัวเอง
}
