/**
 * This Patient program is to accept three arguments: Patient's name is..., Patient's age is...
 * and comes from of that Patient.  Its output format is
 * Patient "patient name , patient age , country"
 *
 * Author: Waranya Prakanpo
 * ID: 633040176-8
 * Sec: 1
 * Date: January 4, 2021
 *
 **/
package prakanpo.waranya.lab2;

public class Patient {
    public static void main(String[] args) {
            if (args.length == 3) {
                System.out.println("Patient's name is " + args[0]);
                System.out.println("Patient's age is " + args[1]);
                System.out.println(args[0] + " comes from " + args[2]);
            } else {
                System.err.println("Patient <patient name> <patient age> <country>");
            }
    }
}
