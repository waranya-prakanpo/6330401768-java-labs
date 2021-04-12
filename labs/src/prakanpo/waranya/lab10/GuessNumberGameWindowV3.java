package prakanpo.waranya.lab10;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GuessNumberGameWindowV3 extends GuessNumberGameWindowV2 {
    protected int maxTries = 3;  //จำนวนรอบทีสูงสุด่สามารถเล่นได้

    public GuessNumberGameWindowV3(String name) {
        super(name);
    }

    protected static void createAndShowGUI() {
        GuessNumberGameWindowV3 gng = new GuessNumberGameWindowV3("GuessNumberGameWindow Version 3 ");
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

    @Override
    public void actionPerformed(ActionEvent e) {
        maxTries--;
        if (e.getSource() == one) {
            playGameGUI(1);
        } else if (e.getSource() == two){
            playGameGUI(2);
        }else if (e.getSource() == tree){
            playGameGUI(3);
        }else if (e.getSource() == four){
            playGameGUI(4);
        }else if (e.getSource() == five){
            playGameGUI(5);
        }else if (e.getSource() == six){
            playGameGUI(6);
        }else if (e.getSource() == seven){
            playGameGUI(7);
        }else if (e.getSource() == eight){
            playGameGUI(8);
        }else if (e.getSource() == nine){
            playGameGUI(9);
        }else if (e.getSource() == ten){
            playGameGUI(10);
        }
    }

    private void playGameGUI(int Button) {
        if (maxTries > -1){ //เพื่อจำกัดจำนวนรอบในการเลือกหมายเลขของผู้ใช้
            if (correctNum == Button) { //ถ้าคำตอบ = หมายเลขที่ผู้ใช้เลือก
                ResultJText.setText("Congratulations!");
                disableButtons();
            } else if (correctNum < Button) { //ถ้าคำตอบ < หมายเลขที่ผู้ใช้เลือก
                ResultJText.setText("Lower");
            } else {
                ResultJText.setText("Higher");
            }
        } else {
            ResultJText.setText("No more tries"); //ถ้าเล่นครบรอบ ให้เเสดงข้อความนี้
            disableButtons(); //เพื่อให้กดปุ๋มไม่ได้
        }
    }
}
