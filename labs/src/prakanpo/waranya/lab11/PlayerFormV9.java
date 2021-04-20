package prakanpo.waranya.lab11;

import prakanpo.waranya.lab10.PlayerFormV8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class PlayerFormV9 extends PlayerFormV8 implements ActionListener {
    protected StringBuffer message;
    protected DateTimeFormatter checkDate;
    public PlayerFormV9(String name) {
        super(name);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }

    public void addListeners() {
        super.addListeners();
    }

    @Override
    public void handleSubmitButton() {
        NameText.setName("Name");  //setName ของ Text
        NationalityText.setName("nationality");
        DateOfBirthText.setName("birthdate");
        GenderMaleRadio.setName("gender");
        PlayerJComBo.setName("player type");
        message = new StringBuffer();

        if (NameText.getText().isEmpty() || NationalityText.getText().isEmpty() || DateOfBirthText.getText().isEmpty()) { //ตรวจสอบว่า มี text ไหนว่าง
            if (NameText.getText().isEmpty()) {
                message.append(NameText.getName() + " is empty.\n "); //เก็บข้อความที่จะเเสดงใว้ใน message
            }
            if (NationalityText.getText().isEmpty()) {
                message.append(NationalityText.getName() + " is empty.\n ");
            }
            if (DateOfBirthText.getText().isEmpty()) {
                message.append(DateOfBirthText.getName() + " is empty. ");
            }
            JOptionPane.showMessageDialog(this,message); //แสดงกล่องข้อความ
            return;
        }
        if (!DateOfBirthText.getText().isEmpty()) { //ถ้าช่อ Date Of Birth ไม่ว่าง
            checkDate = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //ตั้งต่า format dd-MM-yyyy
            try {
                checkDate.parse(DateOfBirthText.getText()); // ใช้ format กับช่อง Date Of Birth
            } catch (DateTimeParseException e) { //ถ้าฟอร์มไม่ถูกต้อง
                JOptionPane.showMessageDialog(this,"Please enter date in the format dd-MM-yyyy such as 31-02-2021"); //แสดงข้อความ
                return;
            }
        }
        if (GamesList.isSelectionEmpty()) { //ถ้าไม่เลือก game
            JOptionPane.showMessageDialog(this, "You have not selected any game"); //แสดงกล่องข้อความ
            return;
        }
        super.handleSubmitButton();
    }

    @Override
    public void addComponents() {
        super.addComponents();
    }

    public static void createAndShowGUI() {
        PlayerFormV9 window = new PlayerFormV9("PlayerFormV9");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
        window.setKeys();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
