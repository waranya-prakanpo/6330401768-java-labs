package prakanpo.waranya.lab7;

import java.util.Comparator;

class SortMaxNum implements Comparator<GuessNumberGameVer4> {
    @Override
    public int compare(GuessNumberGameVer4 o1, GuessNumberGameVer4 o2) {
        return o1.getMaxNum() - o2.getMaxNum(); //ส่งออกค่า maxNum เรียงจากน้อยไปมาก
    }
}

