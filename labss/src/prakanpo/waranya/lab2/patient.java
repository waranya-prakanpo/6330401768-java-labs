/**
 * This Athlete program is to accept three arguments: athlete name, the sport name
 *  that that athlete plays, and the nationality of that athlete.  Its output format is “My
 *  favorite athlete is <athlete_name> who plays <sport_name> and has
 * nationality as <athlete_nationality>”
 *
 * Author: Waranya Prakanpo
 * ID: 633040176-8
 * Sec: 1
 * Date: January 4, 2021
 *
 **/
package prakanpo.waranya.lab2;
public class patient {
    public static void main(String[] args) {
        if (args.length == 3) {
            System.out.println("Patient's name is " + args[0]);
            System.out.println("Patient's age is " + args[1]);
            System.out.println(args[0] + " comes from " + args[2]);
        } else {
            System.err.println("patient <patient name> <patient age> <country>");
        }
    }
}
