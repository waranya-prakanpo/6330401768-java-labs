package prakanpo.waranya.lab10;

import prakanpo.waranya.lab8.PlayerFormV4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerFormV5 extends PlayerFormV4 implements ActionListener  {
    protected StringBuffer resultBuffer;
    protected String name, national, date, gender, Player, selectType;
    public PlayerFormV5(String name) {
        super(name);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        resultBuffer = new StringBuffer();
        if (src == buttonSubmit) {
            handleSubmitButton();
        } else if (src == buttonReset) {
            handleResetButton();
        } else if (src instanceof JTextField) {
            JTextField tf = (JTextField) src;
            handleTextField(tf);
        } else if (src == PlayerJComBo){
            handleComboBox();
        }
    }
    public void addListeners() {
        buttonSubmit.addActionListener(this);
        buttonReset.addActionListener(this);
        NameText.addActionListener(this);
        NationalityText.addActionListener(this);
        DateOfBirthText.addActionListener(this);
        PlayerJComBo.addActionListener(this);
    }

    private void handleResetButton() {
        NameText.setText("");
        NationalityText.setText("");
        DateOfBirthText.setText("");
    }

    private void handleComboBox() {
        Player = "Player type";

        selectType = (String) PlayerJComBo.getSelectedItem();
        JOptionPane.showMessageDialog(this,  Player+" is update to " + selectType);

    }

    private void handleSubmitButton() {
        getGender();

        name = NameText.getText();
        national = NationalityText.getText();
        date = DateOfBirthText.getText();
        JOptionPane.showMessageDialog(this, name + " has nationality as " + national + ",birthdate as " + date + ", as " + gender + ",player type as " + selectType );

    }
    protected void getGender() {
        if (GenderMaleRadio.isSelected()) {
            gender = "Male";
        } else if (GenderFemaleRadio.isSelected()) {
            gender = "Female";
        }
    }

    private void handleTextField(JTextField tf) {
        NameText.setName("Name");
        NationalityText.setName("Nationality");
        DateOfBirthText.setName("Birthday");

        resultBuffer.append(tf.getName() + " is update to " + tf.getText());
        JOptionPane.showMessageDialog(this,resultBuffer);
    }

    public static void createAndShowGUI() {
        PlayerFormV5 window = new PlayerFormV5("PlayerFormV5");
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
