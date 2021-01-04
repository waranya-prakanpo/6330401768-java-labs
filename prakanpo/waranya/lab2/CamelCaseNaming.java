package prakanpo.waranya.lab2;

import java.util.Locale;

public class CamelCaseNaming {
    public static void main(String[] args) {
        if (args.length == 2) {
            String first = args[0];
            String second = args[1];
            String num1 = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
            String num2 = second.substring(0,1).toUpperCase() + second.substring(1).toLowerCase();
            System.out.println("The first word is "+ args[0]);
            System.out.println("The Second word is "+ args[1]);
            System.out.println("The concatenate with cemal case is "+num1+num2);
        } else {
            System.err.println("CamelCaseNaming : <First world> <Second word>");
        }
    }
}
