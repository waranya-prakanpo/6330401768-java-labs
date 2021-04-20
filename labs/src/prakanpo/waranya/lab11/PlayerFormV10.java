package prakanpo.waranya.lab11;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class PlayerFormV10 extends PlayerFormV9{

    protected String filename = "in.txt";
    protected String fileWriteName = "out.txt";
    protected String line;
    protected int read;
    protected int[] list;

    public PlayerFormV10(String name) {
        super(name);
    }

    public void saveFile() throws FileNotFoundException {
            try {
                FileWriter fw = new FileWriter(fileWriteName);
                fw.write(NameText.getText()+"\n");        //เขียนข้อความที่อยู่ใน text
                fw.write(NationalityText.getText()+"\n");
                fw.write(DateOfBirthText.getText()+"\n");

                if (GenderFemaleRadio.isSelected()){ //ถ้าเลือกป่ม female
                    fw.write("Female\n");         //เขียน  Female
                } else if (GenderMaleRadio.isSelected()){ //ถ้าเลือกปุ่ม male
                    fw.write("Male\n");  //เขียน male
                }
                fw.write(PlayerJComBo.getSelectedItem().toString()+"\n");

                if (GamesList.isSelectedIndex(0)) {
                    fw.write("Guess Number Game\n");
                }
                if (GamesList.isSelectedIndex(1)) {
                    fw.write("High-Low Game\n");
                }
                if (GamesList.isSelectedIndex(2)) {
                    fw.write("Monopoly Game");
                }

                fw.close();

            } catch (IOException ex) {
                System.out.println("Error in saving file");
            }
    }

    public void readFile() throws FileNotFoundException {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            ArrayList<Integer> list = new ArrayList<>();
            int[] showGame;
            read = 0;
            while ((line = br.readLine()) != null) {
                read++;
                if (read == 1) //บรรทัดที่อ่าน = บรรทัดที่ 1
                NameText.setText(line);
                else if (read == 2)
                NationalityText.setText(line); //บรรทัดที่ 2
                else if (read == 3)
                DateOfBirthText.setText(line); //บรรทัดที่ 3
                else if (read == 4){ // บรรทัดที่ 4
                    if (line.equals("male")){
                        genderGroup.setSelected(GenderMaleRadio.getModel(),true);
                    } else {
                        genderGroup.setSelected(GenderFemaleRadio.getModel(),true);
                    }
                } else if (read == 5) { //บรรทัดที่ 5
                    if (line.equalsIgnoreCase("Beginner")){
                        PlayerJComBo.setSelectedIndex(0);
                    } else if (line.equalsIgnoreCase("Amateur")) {
                        PlayerJComBo.setSelectedIndex(1);
                    } else if (line.equalsIgnoreCase("Professional")) {
                        PlayerJComBo.setSelectedIndex(2);
                    }
                } else  { //บรรทัดที่ 6-8
                    if (line.equalsIgnoreCase("Guess Number Game"))
                        list.add(0);
                    if (line.equalsIgnoreCase("High-Low Game"))
                        list.add(1);
                    if (line.equalsIgnoreCase("Monopoly Game"))
                        list.add(2);
                }
                showGame = new int[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    showGame[i] = list.get(i);  //เก็บ list ใว้ใน showGame
                }
                GamesList.setSelectedIndices(showGame); // gameList อ่านค่าที่ตรงกับ showGame
            } fr.close();
        } catch (IOException ex) {
            System.out.println("Error in reading file");
        }
    }
    public void handleSaveMI(){
        int returnVal = fileChooser.showSaveDialog(this); //saveFile

        if (returnVal == JFileChooser.APPROVE_OPTION) { //ถ้าผู้ใช้กด save
            File file = fileChooser.getSelectedFile();
            try {
                saveFile();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else if (returnVal == JFileChooser.CANCEL_OPTION) { //ถ้าผู้ใช้กด cancel ให้แสดงกล่องข้อความ
            JOptionPane.showMessageDialog(this,
                    "Save command cancelled by user.");
        }
    }

    public void getGender() {
        if (GenderMaleRadio.isSelected()) { //ถ้าเลือกปุ๋ม male ให้ gender = male
            gender = "Male";
        } else if (GenderFemaleRadio.isSelected()) { //ถ้าเลือกปุ๋ม female ให้ gender = female
            gender = "Female";
        }
    }

    @Override
    public void handleOpenMI() {
        int returnVal = fileChooser.showOpenDialog(this); //openFile

        if (returnVal == JFileChooser.APPROVE_OPTION) { //ถ้าผู้ใช้กด open
            File file = fileChooser.getSelectedFile();
            try {
                readFile();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else if (returnVal == JFileChooser.CANCEL_OPTION) { //ถ้าผู้ใช้กด cancel ให้แสดงกล่องข้อความ
            JOptionPane.showMessageDialog(this,
                    "Open command cancelled by user.");
        }
    }

    public static void createAndShowGUI() {
        PlayerFormV10 window = new PlayerFormV10("PlayerFormV10");
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
