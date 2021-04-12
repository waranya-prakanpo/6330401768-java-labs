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
        selectType = "Amateur";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        resultBuffer = new StringBuffer();
        if (src == buttonSubmit) {  //ถ้ากดปุ่ม submit
            handleSubmitButton();
        } else if (src == buttonReset) { //ถ้ากดปุ๋ม reset
            handleResetButton();
        } else if (src instanceof JTextField) { //ถ้ากด enter ที่ textField
            JTextField tf = (JTextField) src;
            handleTextField(tf);
        } else if (src == PlayerJComBo){ //ถ้ากดเลือก player
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

    private void handleResetButton() { //set text ให้เป็นช่องว่าง
        NameText.setText("");
        NationalityText.setText("");
        DateOfBirthText.setText("");
    }

    private void handleComboBox() { //เมื่อเลือก player ให้เเสดง message
        Player = "Player type";

        selectType = (String) PlayerJComBo.getSelectedItem(); //selectType = Item ของ player ที่ถูกเลือก
        JOptionPane.showMessageDialog(this,  Player+" is update to " + selectType);
    }

    private void handleSubmitButton() {
        getGender();

        name = NameText.getText(); //ให้ name = ข้อความใน textBox ที่ผู้ใช้ช้อนลงไป
        national = NationalityText.getText(); //ให้ nationality = ข้อความใน textBox ที่ผู้ใช้ช้อนลงไป
        date = DateOfBirthText.getText(); //ให้ name = ข้อความใน textBox ที่ผู้ใช้ช้อนลงไป
        JOptionPane.showMessageDialog(this, name + " has nationality as " + national + ", birthdate as " + date + ", gender as " + gender + ", player type as " + selectType ); //แสดงกล่องข้อความ
    }

    protected void getGender() {
        if (GenderMaleRadio.isSelected()) { //ถ้าเลือกปุ๋ม male ให้ gender = male
            gender = "Male";
        } else if (GenderFemaleRadio.isSelected()) { //ถ้าเลือกปุ๋ม female ให้ gender = female
            gender = "Female";
        }
    }

    private void handleTextField(JTextField tf) {
        NameText.setName("Name");  //set ชื่อของ text
        NationalityText.setName("Nationality");
        DateOfBirthText.setName("Birthday");

        resultBuffer.append(tf.getName() + " is update to " + tf.getText()); //tf.getName คือ ชื่อของ textBox ที่ตั้งใว้ tf.getText คือ สิ่งที่ผู้ใช้ป้อนลงใน textBox
        JOptionPane.showMessageDialog(this,resultBuffer); //แสดงกล่องข้อความ
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
