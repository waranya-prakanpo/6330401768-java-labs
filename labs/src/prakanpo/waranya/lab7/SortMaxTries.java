package prakanpo.waranya.lab7;

import java.util.Comparator;

class SortMaxTries implements Comparator<GuessNumberGameVer4> {
    @Override
    public int compare(GuessNumberGameVer4 o1, GuessNumberGameVer4 o2) {
        return o2.getMaxTries() - o1.getMaxTries(); //ส่งออกค่า maxTries เรียงจากมากไปน้อย
    }
}
