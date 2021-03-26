package prakanpo.waranya.lab9;

import prakanpo.waranya.lab6.DiceGame;

import javax.swing.*;
import java.awt.*;

public class DiceGameWindow extends JFrame {
    protected DiceImageCanvas diceImageCanvas;
    protected DiceGame diceGame;
    protected int diceRoll;
    protected JPanel buttonsPanel;
    protected JButton rollButton, highButton, lowButton;

    public DiceGameWindow(String title) {
        super(title);
        diceGame = new DiceGame();
        diceRoll = diceGame.getDiceRoll();
        diceImageCanvas = new DiceImageCanvas(diceRoll);
    }

    public void setFrameFeatures() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void addComponents() {
        buttonsPanel = new JPanel(new FlowLayout());
        rollButton = new JButton("Roll");
        highButton = new JButton("High");
        lowButton = new JButton("Low");
        buttonsPanel.add(highButton);
        buttonsPanel.add(lowButton);
        buttonsPanel.add(rollButton);

        this.setLayout(new BorderLayout());
        this.add(buttonsPanel, BorderLayout.NORTH);
        this.add(diceImageCanvas, BorderLayout.CENTER);
    }

    public static void createAndShowGUI() {
        DiceGameWindow dgw = new DiceGameWindow("DiceGameWindow Version 1");
        dgw.addComponents();
        dgw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
