package prakanpo.waranya.lab10;

import prakanpo.waranya.lab9.GuessNumberGameWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumberGameWindowV2 extends GuessNumberGameWindow implements ActionListener {
    protected int minNum = 10;  //ค่าต่ำสุดของเลขสุ่ม
    protected int maxNum = 1;  //ค่าสูงสุดของเลขสุ่ม
    protected int correctNum;  //เฉลย

    public GuessNumberGameWindowV2(String name) {
        super(name);
    }
    protected static void createAndShowGUI() {
        GuessNumberGameWindowV2 gng = new GuessNumberGameWindowV2("GuessNumberGameWindow Version 2 ");
        gng.addComponents();
        gng.setFrameFeatures();
        gng.addListeners();
    }

    public void addComponents(){
        super.addComponents();
        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1)); //สุ่มคำตอบ
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    public void setFrameFeatures() {
        setVisible(true); //ให้แสดงผลบนหน้าจอ
        setLocationRelativeTo(null); //บังคับให้อยู่ตรงกลาง
        pack(); //ปรับขนาดหน้าต่างให้พอดีกับข้อความ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //เมื่อกด Exit ให้ออกทันที
    }
    public void addListeners() {
        one.addActionListener(this);
        two.addActionListener(this);
        tree.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        ten.addActionListener(this);

    }

        @Override
    public void actionPerformed(ActionEvent e) { //ถ้ากดปุ่มไหนให้ทำตามเงื่อนไขนั้นๆ
        if (e.getSource() == one) {
            playGameGUI(1);
        } else if (e.getSource() == two) {
            playGameGUI(2);
        }else if (e.getSource() == tree) {
            playGameGUI(3);
        }else if (e.getSource() == four) {
            playGameGUI(4);
        }else if (e.getSource() == five) {
            playGameGUI(5);
        }else if (e.getSource() == six) {
            playGameGUI(6);
        }else if (e.getSource() == seven) {
            playGameGUI(7);
        }else if (e.getSource() == eight) {
            playGameGUI(8);
        }else if (e.getSource() == nine) {
            playGameGUI(9);
        }else if (e.getSource() == ten) {
            playGameGUI(10);
        }
    }

    private void playGameGUI(int Button) {
        if (correctNum == Button) {
            ResultJText.setText("Congratulations!"); //ถ้าคำตอบ = หมายเลขที่ผู้ใช้เลือก
            disableButtons();
        } else if (correctNum < Button) { //ถ้าคำตอบ < หมายเลขที่ผู้ใช้เลือก
            ResultJText.setText("Lower");
        } else {
            ResultJText.setText("Higher"); //ถ้าคำตอบ > หมายเลขที่ผู้ใช้เลือก
        }
    }
    public void disableButtons() { // เพื่อให้ปุ๋มกดไม่ได้
        one.setEnabled(false);
        two.setEnabled(false);
        tree.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        ten.setEnabled(false);
    }
}
