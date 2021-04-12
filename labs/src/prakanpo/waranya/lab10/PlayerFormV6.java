package prakanpo.waranya.lab10;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PlayerFormV6 extends PlayerFormV5
implements ItemListener {
    public PlayerFormV6(String name) {
        super(name);
    }
    public void addListeners() {
        super.addListeners();
        GenderFemaleRadio.addItemListener(this);
        GenderMaleRadio.addItemListener(this);
    }

    public static void createAndShowGUI() {
        PlayerFormV6 window = new PlayerFormV6("PlayerFormV6");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) { //แสดงกล่องข้อความว่าผู้ใช้เลือก male or female
            getGender();
            JOptionPane.showMessageDialog(this, "Gender is update to " + gender);
        }
    }

}
