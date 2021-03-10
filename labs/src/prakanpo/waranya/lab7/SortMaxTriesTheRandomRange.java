package prakanpo.waranya.lab7;

import java.util.Comparator;

public class SortMaxTriesTheRandomRange implements Comparator<GuessNumberGameVer4> {

    @Override
    public int compare(GuessNumberGameVer4 o1, GuessNumberGameVer4 o2) {
        int MaxTriesCompare = new SortMaxTries().compare(o1, o2);
        int MaxNumCompare = new SortMaxNum().compare(o1, o2);

        if (MaxTriesCompare == 0) { //ถ้า maxTries = maxNum ให้จัดเรียง maXTries ก่อนค่อยเรียง maxNum
            return (MaxNumCompare == 0) ? MaxTriesCompare : MaxNumCompare;
        } else { //ถ้าไม่ใช่ ให้เรียงตาม MaxTries
            return MaxTriesCompare;
        }
    }
}
