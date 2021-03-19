package prakanpo.waranya.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV2 extends PlayerFormV1 {
    protected String Type[] = {"Beginner", "Amateur", "Professional"};
    protected JComboBox PlayerJComBo;
    protected JScrollPane PlayerJScroll, NoteJScroll;
    protected JPanel PlayerJPanel, contentBottomPanel, NoteJPanel;
    protected JLabel PlayerLabel, NoteJLabel;
    protected JTextArea NoteArea;

    public PlayerFormV2(String name) {
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
        PlayerFormV2 msw = new PlayerFormV2("Player Form V2");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    protected void addComponents() {
        super.addComponents();

        PlayerJComBo = new JComboBox(Type);
        PlayerLabel = new JLabel("Player Type:");
        PlayerJComBo.setSelectedIndex(1); //ให้คำตอบเริ่มต้นอยู่ Index ที่ 1 คือ Amateur
        PlayerJPanel = new JPanel();

        NoteArea = new JTextArea(3,35);
        NoteJScroll =new JScrollPane(NoteArea);
        NoteJLabel = new JLabel("Note:");
        NoteJPanel = new JPanel();

        contentBottomPanel = new JPanel();

        PlayerJPanel.setLayout(new GridLayout(0,2));
        PlayerJPanel.add(PlayerLabel);
        PlayerJPanel.add(PlayerJComBo);

        NoteArea.setLineWrap(true);
        NoteArea.setWrapStyleWord(true);
        NoteArea.setText("A game is a structured form of play,");
        NoteArea.append("usually undertaken for entertainment or fun,");
        NoteArea.append(" and sometimes used as an educational tool.");
        NoteJPanel.setLayout(new GridLayout(2,0));
        NoteJPanel.add(NoteJLabel);
        NoteJPanel.add(NoteJScroll);

        contentBottomPanel.setLayout(new BorderLayout());  //จัดหน้า
        contentBottomPanel.add(PlayerJPanel, BorderLayout.NORTH);
        contentBottomPanel.add(NoteJPanel, BorderLayout.SOUTH);
        mainPanel.add(contentBottomPanel, BorderLayout.CENTER);

    }
}