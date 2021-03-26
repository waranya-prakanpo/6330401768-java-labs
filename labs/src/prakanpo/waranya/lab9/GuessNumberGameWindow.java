package prakanpo.waranya.lab9;
import prakanpo.waranya.lab6.Game;
import prakanpo.waranya.lab6.GuessNumberGame;
import prakanpo.waranya.lab8.PlayerFormV4;


import javax.swing.*;
import java.awt.*;

public class GuessNumberGameWindow extends JFrame {
    protected JButton one, two, tree, four, five, six, seven, eight, nine, ten;
    protected JPanel mainJPanel, GameJPanel, textJPanel, ResultJPanel;
    protected JLabel textLabel, ResultJLabel;
    protected JTextField  ResultJText;

    public GuessNumberGameWindow(String name) {
        super(name);
    }

    protected void addComponents() {  //ประกาศ new JButton แล้วเพิ่มรูปภาพที่ Button
        one = new JButton(new ImageIcon("images/number1.png"));
        two = new JButton(new ImageIcon("images/number2.png"));
        tree = new JButton(new ImageIcon("images/number3.png"));
        four = new JButton(new ImageIcon("images/number4.png"));
        five = new JButton(new ImageIcon("images/number5.png"));
        six = new JButton(new ImageIcon("images/number6.png"));
        seven = new JButton(new ImageIcon("images/number7.png"));
        eight = new JButton(new ImageIcon("images/number8.png"));
        nine = new JButton(new ImageIcon("images/number9.png"));
        ten = new JButton(new ImageIcon("images/number10.png"));

        mainJPanel = new JPanel();
        GameJPanel = new JPanel();
        ResultJPanel = new JPanel();
        textJPanel = new JPanel();

        textLabel = new JLabel("Please guess by clicking at the number:"); //เพิ่ม text
        textLabel.setFont(new Font("Serif", Font.BOLD, 24)); //เลือกฟอนต์และขนาด
        textLabel.setForeground(Color.blue);//เปลี่ยนเป็นสีฟ้า

        ResultJLabel = new JLabel("Result"); //เพิ่ม text Result
        ResultJLabel.setFont(new Font("Serif", Font.BOLD, 24)); //เลือกฟอนต์และขนาด
        ResultJLabel.setForeground(Color.blue); //เปลี่ยนเป็นสีฟ้า
        ResultJText = new JTextField("Congratulations!",24); //เพิ่ม text congratulations!
        ResultJText.setEditable(false); //ห้ามเพิ่ม text

        ResultJPanel.add(ResultJLabel);
        ResultJPanel.add(ResultJText);

        textJPanel.add(textLabel);

        mainJPanel.setLayout(new GridLayout(2, 5));
        mainJPanel.add(one);
        mainJPanel.add(two);
        mainJPanel.add(tree);
        mainJPanel.add(four);
        mainJPanel.add(five);
        mainJPanel.add(six);
        mainJPanel.add(seven);
        mainJPanel.add(eight);
        mainJPanel.add(nine);
        mainJPanel.add(ten);

        GameJPanel.setLayout(new BorderLayout());
        add(GameJPanel);
        GameJPanel.add(textJPanel, BorderLayout.NORTH);
        GameJPanel.add(mainJPanel, BorderLayout.CENTER);
        GameJPanel.add(ResultJPanel, BorderLayout.SOUTH);
    }

    protected static void createAndShowGUI() {
        GuessNumberGameWindow gng = new GuessNumberGameWindow("GuessNumberGameWindow Version 1 ");
        gng.addComponents();
        gng.setFrameFeatures();
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    protected void setFrameFeatures() {
        setVisible(true); //ให้แสดงผลบนหน้าจอ
        setLocationRelativeTo(null); //บังคับให้อยู่ตรงกลาง
        pack(); //ปรับขนาดหน้าต่างให้พอดีกับข้อความ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //เมื่อกด Exit ให้ออกทันที
    }
}
