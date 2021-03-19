package prakanpo.waranya.lab8;

import javax.swing.*;
import java.awt.*;

public class MySimpleWindow extends JFrame {
    protected JButton buttonReset;
    protected JButton buttonSubmit;
    protected JPanel mainPanel, buttonPanel;

    public MySimpleWindow(String name) {
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
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();

    }

    protected void  addComponents() {
        buttonReset = new JButton("Reset");
        buttonSubmit = new JButton("Submit");
        mainPanel = new JPanel();
        buttonPanel = new JPanel();

        mainPanel.setLayout(new BorderLayout());

        buttonPanel.add(buttonReset); //เพิ่มปุ่ม Reset ลงใน buttonPanel
        buttonPanel.add(buttonSubmit); //เพิ่มปุ่ม Submit ลงใน buttonPanel
        mainPanel.add(buttonPanel); //เพิ่ม buttonPanel ลงใน mainPanel

        add(mainPanel);
        //setContentPane(mainPanel); อันเดียวกับข้างบน เขียนได้ทั้ง 2 แบบ
    }
    protected void setFrameFeatures() {
        setVisible(true); //ให้แสดงผลบนหน้าจอ
        setLocationRelativeTo(null); //บังคับให้อยู่ตรงกลาง
        pack(); //ปรับขนาดหน้าต่างให้พอดีกับข้อความ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //เมื่อกด Exit ให้ออกทันที
    }
}
