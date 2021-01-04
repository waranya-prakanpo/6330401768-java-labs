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
public class CircleCalculator {
    public static void main(String[] args) {
        if (args.length == 1) {
            double radius = Double.parseDouble(args[0]);
            if (radius >= 1) {
                double area = Math.PI * radius * radius;
                System.out.println("An area of a circle with radius of " + radius + " is " + String.format("%.2f", area));
                double circumference = 2 * Math.PI * radius;
                System.out.println("A circumference is " + String.format("%.2f", circumference));
            } else {
                System.err.println("prakanpo.waranya.lab2.CircleCalculator <radius of a circle>");
            }
        } else {
                System.err.println("prakanpo.waranya.lab2.CircleCalculator <radius of a circle>");

        }

    }
}
