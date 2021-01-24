package prakanpo.waranya.lab4;
import java.util.Scanner;

public class StudentGPA {
    static int MAX_NUMBER_OF_COURSE = 150;
    static int[] year = new int[MAX_NUMBER_OF_COURSE]; // int as year 1st to year 8th
    static int[] trem = new int[MAX_NUMBER_OF_COURSE]; //1 first term, 2 second term and 3 for summer
    static String[] couseName = new String[MAX_NUMBER_OF_COURSE]; //ex.EN811301
    static int[] courseCredit = new int[MAX_NUMBER_OF_COURSE]; // int 1 to 3
    static String[] grades = new String[MAX_NUMBER_OF_COURSE]; //A, B+, B, C+, C, D+, D, F
    static int numberOfCourses = 0;
    static int count = 0;

    public static void main(String[] args) {
        inputGreades();
        showGPA();
    }

    public static void inputGreades() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grades of student (year term name_course credit grade)." +
                "\nFinish when enter year with 0");
        for (int i = 0; i < MAX_NUMBER_OF_COURSE; i++) {
            numberOfCourses = sc.nextInt();
            if (numberOfCourses != 0) {
                year[i] = numberOfCourses;
                trem[i] = sc.nextInt();
                couseName[i] = sc.next();
                courseCredit[i] = sc.nextInt();
                grades[i] = sc.next();
                count++;
            }
            else {
                break;
            }
        }
        check();
    }

    public static void showGPA() { //แสดงเกรดเฉลี่ยรวม
        double a = 4.0,  b = 3.0 , b1 = 3.5, c = 2.0, c1 = 2.5, d = 1.0, d1 = 1.5, f = 0.0;
        double greadA, greadB1 , greadB, greadC1, greadC, greadD1, greadD, greadF;
        double totalA = 0,totalB1=0, totalB=0, totalC1=0, totalC=0, totalD1=0, totalD=0, totalF=0, total=0;

        for (int i = 0;i<count;i++) {
            if (grades[i].equals("A")) {
                greadA = a*courseCredit[i];
                totalA += greadA;
            } else if (grades[i].equals("B+")){
                greadB1 = b1*courseCredit[i];
                totalB1 += greadB1;
            } else if (grades[i].equals("B")){
                greadB = b*courseCredit[i];
                totalB += greadB;
            } else if (grades[i].equals("C+")){
                greadC1 = c1*courseCredit[i];
                totalC1 += greadC1;
            } else if (grades[i].equals("C")){
                greadC = c*courseCredit[i];
                totalC += greadC;
            } else if (grades[i].equals("D+")){
                greadD1 = d1*courseCredit[i];
                totalD1 += greadD1;
            } else if (grades[i].equals("D")){
                greadD = d*courseCredit[i];
                totalD += greadD;
            } else if (grades[i].equals("F")){
                greadF = f*courseCredit[i];
                totalF += greadF;
            }
        }
        for (int i = 0; i<count; i++){
            int credit = courseCredit[i];
            total += credit;
        }
        Double Answer = totalA+totalB1+totalB+totalC1+totalC+totalD1+totalD+totalF;
        Double GPA = Answer / total;
        System.out.println("Accumulated GPA is " + GPA);
    }

    public static void checkO() { //แสดง ปี เทอม รหัสวิชา หน่วยกิต เเละ เกรดที่นำเข้า
        System.out.println("year term course_number credit grade");
        for (int i = 0; i < count; i++) {
            System.out.print(year[i] + " " + trem[i] + " " + couseName[i] + " " + courseCredit[i] + " " + grades[i]);
        }
        System.out.println();
    }
    public static void checkT() { //แสดงเกรดเฉลี่ยนตาม ปีเเละเทอมที่ระบุ
        double a = 4.0,  b = 3.0 , b1 = 3.5, c = 2.0, c1 = 2.5, d = 1.0, d1 = 1.5, f = 0.0;
        double greadA, greadB1 , greadB, greadC1, greadC, greadD1, greadD, greadF;
        double totalA = 0,totalB1=0, totalB=0, totalC1=0, totalC=0, totalD1=0, totalD=0, totalF=0, total=0;
        System.out.println("Enter which year and term do you want to see GPA");
        Scanner sc = new Scanner(System.in);
        int yearr = sc.nextInt(); //นำเข้าปี่ที่ศึกษา
        int termm = sc.nextInt(); //นำเข้าเทอมที่ศึกษา
        for (int i = 0; i<count; i++) {
            if (year[i] == yearr && trem[i] == termm){
                if (grades[i].equals("A")) {
                    greadA = a*courseCredit[i];
                    totalA += greadA;
                } else if (grades[i].equals("B+")){
                    greadB1 = b1*courseCredit[i];
                    totalB1 += greadB1;
                } else if (grades[i].equals("B")){
                    greadB = b*courseCredit[i];
                    totalB += greadB;
                } else if (grades[i].equals("C+")){
                    greadC1 = c1*courseCredit[i];
                    totalC1 += greadC1;
                } else if (grades[i].equals("C")){
                    greadC = c*courseCredit[i];
                    totalC += greadC;
                } else if (grades[i].equals("D+")){
                    greadD1 = d1*courseCredit[i];
                    totalD1 += greadD1;
                } else if (grades[i].equals("D")){
                    greadD = d*courseCredit[i];
                    totalD += greadD;
                } else if (grades[i].equals("F")){
                    greadF = f*courseCredit[i];
                    totalF += greadF;
                }
                int credit = courseCredit[i];
                total += credit;
            }
        }
        Double Answer = totalA+totalB1+totalB+totalC1+totalC+totalD1+totalD+totalF;
        Double GPA = Answer / total;
        System.out.println("Accumulated GPA is " + GPA);
    }

    public static void check() {
        while (true) {
            System.out.println("Type in 'o' to see all courses, 'a' for accumulated GPA, 't' for GPA for specific term or 'q' to exit");
            Scanner sc = new Scanner(System.in);
            String checkk = sc.next();
            if (checkk.equals("o")){
                checkO();
            } else if (checkk.equals("a")){
                showGPA();
            } else if (checkk.equals("t")){
                checkT();
            } else if (checkk.equals("q")){
                System.exit(0);
            } else {
                check();
            }
        }
    }
}
