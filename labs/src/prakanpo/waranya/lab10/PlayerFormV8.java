package prakanpo.waranya.lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class PlayerFormV8 extends PlayerFormV7 implements ActionListener {
    protected JFileChooser fileChooser;

    public PlayerFormV8(String name) {
        super(name);
        fileChooser = new JFileChooser();
    }

    public void addListeners() {
        ExitMI.addActionListener(this);
        openMI.addActionListener(this);
        saveMI.addActionListener(this);
        GreenMI.addActionListener(this);
        RadMI.addActionListener(this);
        BlueMI.addActionListener(this);
        Size16.addActionListener(this);
        Size20.addActionListener(this);
        Size24.addActionListener(this);
    }

        @Override
    public void actionPerformed(ActionEvent e) {
        if ((e.getSource().equals(ExitMI)) ) {
            System.exit(0);
        } else if (e.getSource().equals(openMI)){
            handleOpenMI();
        } else if (e.getSource().equals(saveMI)) {
            handleSaveMI();
        } else if (e.getSource().equals(GreenMI)) {
            setColorGreen();
        }else if (e.getSource().equals(RadMI)) {
            setColorRed();
        }else if (e.getSource().equals(BlueMI)) {
            setColorBlue();
        }else if (e.getSource().equals(Size16)){
            setSize16();
        }else if (e.getSource().equals(Size20)){
            setSize20();
        }else if (e.getSource().equals(Size24)){
            setSize24();
        }
    }

    private void setSize16() {
        NoteArea.setFont(new Font("", 0, 16)); //เลือกฟอนต์และขนาด
    }

    private void setSize20() {
        NoteArea.setFont(new Font("", 0, 20)); //เลือกฟอนต์และขนาด
    }

    private void setSize24() {
        NoteArea.setFont(new Font("", 0, 24)); //เลือกฟอนต์และขนาด
    }

    private void setColorBlue() { //ให้ text ใน textBox เป็นสีฟ้า
        NameText.setForeground(Color.BLUE);
        NationalityText.setForeground(Color.BLUE);
        DateOfBirthText.setForeground(Color.BLUE);
    }

    private void setColorRed() { //ให้ text ใน textBox เป็นสีแดง
        NameText.setForeground(Color.RED);
        NationalityText.setForeground(Color.RED);
        DateOfBirthText.setForeground(Color.RED);
    }

    private void setColorGreen() { //ให้ text ใน textBox เป็นสีเขียว
        NameText.setForeground(Color.GREEN);
        NationalityText.setForeground(Color.GREEN);
        DateOfBirthText.setForeground(Color.GREEN);
    }

    public void setKeys() {
        openMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK)); //ctrl+O = กด open
        saveMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK)); //ctrl+S = กด save
        ExitMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK)); //ctrl+Q = กด Exit
    }
    public void handleSaveMI(){
        int returnVal = fileChooser.showSaveDialog(this); //saveFile

        if (returnVal == JFileChooser.APPROVE_OPTION) { //ถ้าผู้ใช้กด save ให้แสดงกล่องข้อความ
            File file = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(this,
                    "Save file " + file.getName() + "?");
        } else if (returnVal == JFileChooser.CANCEL_OPTION) { //ถ้าผู้ใช้กด cancel ให้แสดงกล่องข้อความ
            JOptionPane.showMessageDialog(this,
                    "Save command cancelled by user.");
        }
    }

    public void handleOpenMI() {
        int returnVal = fileChooser.showOpenDialog(this); //openFile

        if (returnVal == JFileChooser.APPROVE_OPTION) { //ถ้าผู้ใช้กด open ให้แสดงกล่องข้อความ
            File file = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(this,
                    "Open file " + file.getName() );
        } else if (returnVal == JFileChooser.CANCEL_OPTION) { //ถ้าผู้ใช้กด cancel ให้แสดงกล่องข้อความ
            JOptionPane.showMessageDialog(this,
                    "Open command cancelled by user.");
        }
    }
    public static void createAndShowGUI() {
        PlayerFormV8 window = new PlayerFormV8("PlayerFormV8");
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
