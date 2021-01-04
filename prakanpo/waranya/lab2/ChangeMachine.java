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
            int total = num1+(2*num2)+(5*num3)+(10*num4);
            System.out.println("Total amount : "+total);
            int thousand = total/1000;
            int fivehundred = (total%1000)/500;
            int hundred = ((total%1000)%500)/100;
            int twenty = (((total%100)%500)%100)/20;
            int remain = thousand+fivehundred+hundred+twenty ;
            System.out.println("1,000-bath bill : "+thousand);
            System.out.println("500-bath bill : "+fivehundred);
            System.out.println("100-bath bill : "+hundred);
            System.out.println("20-bath bill : "+twenty);
            System.out.println("Money remain : "+remain);



        } else {
            System.err.println("ChangeMachine <1-baht coins> <2-baht coins> <5-baht coins> <10-baht coins>");
        }

    }
}

