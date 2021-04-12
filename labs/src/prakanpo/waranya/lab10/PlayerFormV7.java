package prakanpo.waranya.lab10;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.List;

public class PlayerFormV7 extends PlayerFormV6
        implements ListSelectionListener  {
    ListSelectionModel lsm;

    public PlayerFormV7(String name) {
        super(name);
    }

    public void addComponents() {
        super.addComponents();
        GamesList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        lsm = GamesList.getSelectionModel();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        boolean isAdjusting = e.getValueIsAdjusting();
        // Need to make sure that the user finishes
        // selecting
        StringBuffer message = new StringBuffer();
        if (!isAdjusting) {
            // Print the names of selected items
            List<String> selectedGames = GamesList.getSelectedValuesList();
            int numSelected = selectedGames.size();
            for (int i = 0; i < numSelected; i++) {
                message.append(selectedGames.get(i) + " " );
            }
            JOptionPane.showMessageDialog(this, message.toString());
        }
    }

    public void addListeners() {
        super.addListeners();
        lsm.addListSelectionListener(this);
    }

    public static void createAndShowGUI() {
        PlayerFormV7 window = new PlayerFormV7("PlayerFormV7");
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
}
