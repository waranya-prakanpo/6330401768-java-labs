package prakanpo.waranya.lab2;

public class CircleCalculator {
    public static void main(String[] args) {
        if (args.length==1){
            double num = Double.parseDouble(args[0]);
            double num1 = Math.PI*num*num;
            System.out.println("An area of a circle with radius of " + num +" is "+ String.format("%.2f",num1) );
            double num2 = 2*Math.PI*num ;
            System.out.println("A circumference is "+String.format("%.2f",num2));
        } else {
            System.err.println("CircleCalculator <radius of a circle>");

        }

    }
}
