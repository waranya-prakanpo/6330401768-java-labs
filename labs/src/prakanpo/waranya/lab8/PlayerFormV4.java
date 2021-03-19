package prakanpo.waranya.lab8;

import prakanpo.waranya.midteramm.SimpleFormV4;

import javax.swing.*;

public class PlayerFormV4 extends PlayerFormV3{
    protected JMenuBar menuBar;
    protected JMenu fileMenu, ConfigMenu;
    protected JMenuItem newMI, openMI, saveMI, ExitMI, ColorMI,SizeMI;


    public PlayerFormV4(String name) {
        super(name);
    }
    public void addMenus() {
        menuBar = new JMenuBar(); //เพิ่ม New Open Save Exit ลงใน file ซึ่ง file คือ MenuBar
        fileMenu = new JMenu("File");
        newMI = new JMenuItem("New", new ImageIcon("image/newIcon.png"));
        openMI = new JMenuItem("Open", new ImageIcon("image/openIcon.png"));
        saveMI = new JMenuItem("Save", new ImageIcon("image/saveIcon.png"));
        ExitMI = new JMenuItem("Exit");
        menuBar.add(fileMenu);
        fileMenu.add(newMI);
        fileMenu.add(openMI);
        fileMenu.add(saveMI);
        fileMenu.add(ExitMI);

        ConfigMenu = new JMenu("Config"); //สร้าง Config เป็น MenuBar ซึ่งประกอบไปด้วย Color และ Size
        ColorMI = new JMenu("Color");
        ColorMI.add(new JMenuItem("Red")); //Color ย่อยออกมาเป็น Red Green Blue
        ColorMI.add(new JMenuItem("Green"));
        ColorMI.add(new JMenuItem("Blue"));

        SizeMI = new JMenu("Size");  //Size ย่อยออกมาเป็น 16 20 24
        SizeMI.add(new JMenuItem("16"));
        SizeMI.add(new JMenuItem("20"));
        SizeMI.add(new JMenuItem("24"));

        menuBar.add(ConfigMenu);
        ConfigMenu.add(ColorMI);
        ConfigMenu.add(SizeMI);

        this.setJMenuBar(menuBar);
    }
    public static void createAndShowGUI() {
        PlayerFormV4 window = new PlayerFormV4("PlayerFormV4");
        window.addComponents();
        window.addMenus();
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
