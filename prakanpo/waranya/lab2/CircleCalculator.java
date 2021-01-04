package prakanpo.waranya.lab2;

public class CircleCalculator {
    public static void main(String[] args) {
        if (args.length==1){
            double radius = Double.parseDouble(args[0]);
            double area = Math.PI*radius*radius;
            System.out.println("An area of a circle with radius of " + radius +" is "+ String.format("%.2f",area) );
            double circumference = 2*Math.PI*radius ;
            System.out.println("A circumference is "+String.format("%.2f",circumference));
        } else {
            System.err.println("CircleCalculator <radius of a circle>");

        }

    }
}
