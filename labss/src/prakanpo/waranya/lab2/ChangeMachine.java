/**
 * This ChangeMachine program is to accept four arguments: 1-baht coins, 2-baht coins,
 * 5-baht coins and 10-baht coins Its output format is Total and The program displays
 * the least number of 1,000-baht bills, 500-baht bills, 100-baht bills,
 * 20-baht bills and the money remains respectively.
 *
 * Author: Waranya Prakanpo
 * ID: 633040176-8
 * Sec: 1
 * Date: January 4, 2021
 *
 **/
package prakanpo.waranya.lab2;

public class ChangeMachine {
    public static void main(String[] args) {
        if (args.length == 4) {
            System.out.println("1-baht coins : " + args[0]);
            System.out.println("2-baht coins : " + args[1]);
            System.out.println("5-baht coins : " + args[2]);
            System.out.println("10-baht coins : " + args[3]);
            int bath1=Integer.parseInt(args[0]);
            int bath2=Integer.parseInt(args[1]);
            int bath3=Integer.parseInt(args[2]);
            int bath4=Integer.parseInt(args[3]);
            int total = bath1 + (2 * bath2) + (5 * bath3) + (10 * bath4);
            System.out.println("Total amount : " + total);
            int thousand = total / 1000;
            int fiveHundred = (total % 1000) / 500;
            int hundred = ((total % 1000) % 500) / 100;
            int twenty = (((total % 100) % 500) % 100) / 20;
            int remain = ((((total % 100) % 500) % 100) % 20);
            System.out.println("1,000-bath bill : " + thousand);
            System.out.println("500-bath bill : " + fiveHundred);
            System.out.println("100-bath bill : " + hundred);
            System.out.println("20-bath bill : " + twenty);
            System.out.println("Money remain : " + remain);
        } else {
            System.err.println("ChangeMachine <1-baht coins> <2-baht coins> <5-baht coins> <10-baht coins>");
        }
    }
}
