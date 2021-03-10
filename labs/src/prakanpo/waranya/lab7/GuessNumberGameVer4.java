package prakanpo.waranya.lab7;

import prakanpo.waranya.lab5.GuessNumberGameVer3;

import java.util.ArrayList;
import java.util.Collections;

public class GuessNumberGameVer4 extends GuessNumberGameVer3 {
    static ArrayList<GuessNumberGameVer4> games =
            new ArrayList<GuessNumberGameVer4>(0);

    public GuessNumberGameVer4(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
    }

    public static void initGamesList() { //สร้าง object ใหม่ โดยใช้ชื่อเดิม
        games.add(new GuessNumberGameVer4(1,10,3));
        games.add(new GuessNumberGameVer4(1,10,5));
        games.add(new GuessNumberGameVer4(1,5,5));

        System.out.println("Unsorted");
        for (GuessNumberGameVer4 game: games) {
            System.out.println(game);
        }
    }

    public static void testComparingMaxTries() {
        initGamesList();
        Collections.sort(games,new SortMaxTries()); //เรียก SortMaxTries เพื่อเรียงค่า maxTries เรียงจากมากไปน้อย

        System.out.println("\nSorted by max tries in descending order");
        for (GuessNumberGameVer4 game: games) {
            System.out.println(game);
        }
    }
    public static void testComparingMaxTriesTheRandomRange() {
        initGamesList();
        Collections.sort(games,new SortMaxTriesTheRandomRange()); //เรียก SortMaxTriesTheRandomRange เพื่อเรียงค่า maxTries เจากน้อยไปมาก และเรียงค่า MaxNumBer จากน้อยไปมาก

        System.out.println("\nSorted by max tries in descending order and random range in ascending order");
        for (GuessNumberGameVer4 game: games) {
            System.out.println(game);
        }
    }

    public static void main(String[] args) {
        testComparingMaxTries();
        //testComparingMaxTriesTheRandomRange();
    }
}

