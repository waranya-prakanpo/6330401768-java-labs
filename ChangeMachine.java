package prakanpo.waranya.lab2;

public class ChangeMachine {
    public static void main(String[] args) {
        if (args.length == 4) {
            System.out.println("1-baht coins : "+ args[0]);
            System.out.println("2-baht coins : "+ args[1]);
            System.out.println("5-baht coins : "+ args[2]);
            System.out.println("10-baht coins : "+ args[3]);
            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            int num3=Integer.parseInt(args[2]);
            int num4=Integer.parseInt(args[3]);
            int number = num1+(2*num2)+(5*num3)+(10*num4);
            System.out.println("Total amount : "+number);
            int num5 = number/1000;
            int num6 = (number%1000)/500;
            int num7 = ((number%1000)%500)/100;
            int num8 = (((number%100)%500)%100)/20;
            int remain = num5+num6+num7+num8 ;
            System.out.println("1,000-bath bill : "+num5);
            System.out.println("500-bath bill : "+num6);
            System.out.println("100-bath bill : "+num7);
            System.out.println("20-bath bill : "+num8);
            System.out.println("Money remain : "+remain);



        } else {
            System.err.println("ChangeMachine <1-baht coins> <2-baht coins> <5-baht coins> <10-baht coins>");
        }

    }
}

