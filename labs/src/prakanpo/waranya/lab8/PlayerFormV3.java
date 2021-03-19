package prakanpo.waranya.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV3 extends PlayerFormV2 {
    protected String[] Games = {"Guess Number Game", "High-Low Game", "Monopoly Game"};
    protected JList GamesList;
    protected JPanel GamesPanel;
    protected JLabel GamesLabel;

    public PlayerFormV3(String name) {
        super(name);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PlayerFormV3 msw = new PlayerFormV3("PlayerFormV3");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    protected void  addComponents() {
        super.addComponents();

        GamesPanel = new JPanel();
        GamesLabel = new JLabel("Game:");
        GamesList = new JList(Games);

        GamesPanel.setLayout(new GridLayout(0,2));
        GamesPanel.add(GamesLabel);
        GamesPanel.add(GamesList);

        contentBottomPanel.add(GamesPanel, BorderLayout.CENTER);

    }
}
