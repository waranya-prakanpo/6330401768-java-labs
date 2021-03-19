package prakanpo.waranya.lab8;

import javax.swing.*;
import java.awt.*;


public class PlayerFormV1 extends MySimpleWindow {
    protected JPanel NamePanel, NationalityPanel, DateOfBirthPanel, GenderPanel, contentPanel, contentPanelButton;
    protected JPanel genderRButtons;
    protected JLabel NameLabel, NationalityLabel, DateOfBirthLabel, GenderLabel;
    protected JTextField NameText, NationalityText, DateOfBirthText;
    protected JRadioButton GenderMaleRadio, GenderFemaleRadio;
    protected ButtonGroup genderGroup;

    public PlayerFormV1(String name) {
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
        PlayerFormV1 msw = new PlayerFormV1("Player Form V1");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    protected void addComponents() {
        super.addComponents();

        NamePanel = new JPanel();
        NationalityPanel = new JPanel();
        DateOfBirthPanel = new JPanel();
        genderRButtons = new JPanel(); //สร้างช่องเพื่อเก็บ RadioButton ของ male และ Female
        NameLabel = new JLabel("Name: ");
        NationalityLabel = new JLabel ("Nationality: ");
        DateOfBirthLabel = new JLabel("Date of Birth (eg.,31-01-1990): ");


        GenderMaleRadio = new JRadioButton("Male");
        GenderFemaleRadio = new JRadioButton("Female",true); //true คือให้คำตอบแรกอยู่ที่ Female
        genderGroup = new ButtonGroup();
        genderGroup.add(GenderMaleRadio);
        genderGroup.add(GenderFemaleRadio);
        GenderLabel = new JLabel("Gender:");
        GenderPanel = new JPanel();
        contentPanel = new JPanel();
        contentPanelButton = new JPanel();
        NameText = new JTextField(15);
        NationalityText = new JTextField(15);
        DateOfBirthText = new JTextField(15);


        genderRButtons.add(GenderMaleRadio);
        genderRButtons.add(GenderFemaleRadio);

        NamePanel.setLayout(new GridLayout(0,2));
        NamePanel.add(NameLabel);
        NamePanel.add(NameText);

        NationalityPanel.setLayout(new GridLayout(0,2));
        NationalityPanel.add(NationalityLabel);
        NationalityPanel.add(NationalityText);

        DateOfBirthPanel.setLayout(new GridLayout(0,2));
        DateOfBirthPanel.add(DateOfBirthLabel);
        DateOfBirthPanel.add(DateOfBirthText);

        GenderPanel.setLayout(new GridLayout(0,2));
        GenderPanel.add(GenderLabel);
        GenderPanel.add(genderRButtons);

        contentPanel.setLayout(new BorderLayout());                 //จัดหน้า
        contentPanelButton.setLayout(new BorderLayout());
        contentPanel.add(NamePanel,BorderLayout.NORTH);
        contentPanel.add(NationalityPanel,BorderLayout.CENTER);
        contentPanel.add(DateOfBirthPanel,BorderLayout.SOUTH);
        contentPanelButton.add(contentPanel,BorderLayout.NORTH);
        contentPanelButton.add(GenderPanel, BorderLayout.CENTER);
        mainPanel.add(contentPanelButton, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);


    }
}