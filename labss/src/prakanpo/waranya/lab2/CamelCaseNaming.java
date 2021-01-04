/**
 * This CamelCaseNaming program is to accept two arguments: the first word
 * and the Second word of that CamelCaseNaming.  Its output format is
 * “The concatenate with cemal case is the first word and the Second word"
 *
 * Author: Waranya Prakanpo
 * ID: 633040176-8
 * Sec: 1
 * Date: January 4, 2021
 *
 **/
package prakanpo.waranya.lab2;

public class CamelCaseNaming {
    public static void main(String[] args) {
        if (args.length == 2) {
            String first = args[0];
            String second = args[1];
            String firstEdit = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
            String secondEdit = second.substring(0,1).toUpperCase() + second.substring(1).toLowerCase();
            System.out.println("The first word is " + args[0]);
            System.out.println("The Second word is " + args[1]);
            System.out.println("The concatenate with cemal case is " + firstEdit+secondEdit);
        } else {
            System.err.println("CamelCaseNaming : <First word> <Second word>");
        }
    }
}
