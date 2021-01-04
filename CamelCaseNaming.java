package prakanpo.waranya.lab2;

import java.util.Locale;

public class CamelCaseNaming {
    public static void main(String[] args) {
        if (args.length == 2) {
            String num1 = args[0];
            String num2 = args[1];
            String one = num1.substring(0,1).toUpperCase() + num1.substring(1).toLowerCase();
            String two = num2.substring(0,1).toUpperCase() + num2.substring(1).toLowerCase();
            System.out.println("The first word is "+ args[0]);
            System.out.println("The Second word is "+ args[1]);
            System.out.println("The concatenate with cemal case is "+one+two);
        } else {
            System.err.println("CamelCaseNaming : <First world> <Second word>");
        }
    }
}
