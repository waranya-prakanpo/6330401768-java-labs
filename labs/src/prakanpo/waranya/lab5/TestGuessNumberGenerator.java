package prakanpo.waranya.lab5;

public class TestGuessNumberGenerator {
    public static void testConstructors() {
        GuessNumberGameVer1 gng1 = new GuessNumberGameVer1();
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5,10);

        GuessNumberGameVer1 gng3 = new GuessNumberGameVer1(10,20,5);
        System.out.println(gng1);
        gng1.playGame();
        System.out.println(gng2);
        gng2.playGame();
        System.out.println(gng3);
        gng3.playGame();
    }

    public static void testSetterGetterMethods() {
        GuessNumberGameVer1 gng = new GuessNumberGameVer1();
        System.out.println("The first guess number game is");
        System.out.println(gng);
        System.out.println("Now, the number of game is " + GuessNumberGameVer1.getNumOfGame());
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5,20);
        System.out.println("Creating another guess number game");
        System.out.println("Now, the number of game is " + GuessNumberGameVer1.getNumOfGame());

        gng.setMinNum(2);
        gng.setMaxNum(5);
        gng.setMaxTries(2);
        System.out.println("GuessNumberGame with new setting");
        System.out.println(gng);
        System.out.println("GuessNumberGame with getting methods");
        System.out.println("Min num is " + gng.getMinNum() + ", max num is " + gng.getMaxNum() + ", and max tries is " + gng.getMaxTries());

    }

    public static void main(String[] args) {
        //testConstructors();
        testSetterGetterMethods();
    }
}
