package prakanpo.waranya.lab4;

import java.util.Scanner;

public class MatrixDisplay {
    static int[][] matrix;
    static int rowDimension, columnDimension;

    public static void main(String[] args) {
        inputMatrix();
        showMatrix();
        showMatrixByRow();
        showMatrixByColumn();
        showMaxtrixByRowBackward();
        showMaxtrixBycolumnBackward();
        showMatrixByRowZizzag();
    }

    public static void inputMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row than number of column of a matrix:");
        while(true) {
            rowDimension = sc.nextInt();
            columnDimension = sc.nextInt();
            if (rowDimension > 0 && columnDimension > 0) {
                matrix = new int[rowDimension][columnDimension]; //กำหนดให้อาร์เรย์ matrix เก็บค่า roeDimension และ columnDimension
                break;
            }
            else {
                System.out.println("Number of column and row must be positive.");
            }
        }
        System.out.println("Enter your matrix by row.");
        for (int i = 0; i<rowDimension;i++){
            for (int j = 0; j<columnDimension;j++){
                int date = sc.nextInt();   //รับค่า date เก็บใน matrix
                matrix[i][j] = date;
            }
        }
    }

    public static void showMatrix() {
        System.out.println("Showing oruginal matrix:");
        for (int i = 0; i < rowDimension; i++) {    //ส่งออก matrix ในรูปพื้นฐาน matrix
            for (int j = 0; j < columnDimension; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void showMatrixByRow() {
        System.out.print("Show matrix by rows :");  //ส่งออก matrix อ่านค่าเป็นเเถว
        for (int i = 0; i < rowDimension; i++) {
            for (int j = 0; j < columnDimension; j++) {
                System.out.print(" " + matrix[i][j]);
            }
        }
        System.out.println();
    }

    public static void showMatrixByColumn() {
        System.out.print("Show matrix by columns :"); //ส่งออก matrix อ่านค่าเป็นหลัก
        for (int i = 0; i < columnDimension; i++) {
            for (int j = 0; j < rowDimension; j++) {
                System.out.print(" " + matrix[j][i]);
            }
        }
        System.out.println();
    }

    public static void showMaxtrixByRowBackward() {
        System.out.print("Show matrix by rows backward :"); //ส่งออก matrix อ่านค่าเป็นเเถวจากหลังสุด
        for (int i = rowDimension-1; i >= 0; i--) {
            for (int j = columnDimension-1; j >= 0; j--) {
                System.out.print(" " + matrix[i][j]);
            }
        }
        System.out.println();
    }

    public static void showMaxtrixBycolumnBackward() {
        System.out.print("Show matrix by column backward :");  //ส่งออก matrix อ่านค่าเป็นหลักจากหลังสุด
        for (int i = columnDimension-1; i >= 0; i--) {
            for (int j = rowDimension-1; j >= 0; j--) {
                System.out.print(" " + matrix[j][i]);
            }
        }
        System.out.println();
    }

    public static void showMatrixByRowZizzag() {
        System.out.print("Show matrix by rows zizzag:");   //ส่งออก matrix อ่านค่าเป็นเเถวโดยอ่านแบบซิกแซก คือ แถวเลขคู่อ่านจากด้านหน้า แถวเลขคี่อ่านจากด้านหลัง
        for (int i = 0; i<rowDimension; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < columnDimension; j++) {
                    System.out.print(" " + matrix[i][j]);
                }
            } else {
                for (int j = columnDimension - 1; j >= 0; j--) {
                    System.out.print(" " + matrix[i][j]);
                }
            }
        }
    }
}
