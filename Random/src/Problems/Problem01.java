package Problems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args){

        long loanAmount;
        int years;
        double rate;
        final DecimalFormat df = new DecimalFormat("0.000");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        loanAmount = scanner.nextLong();
        System.out.print("Numbers of Years: ");
        years = scanner.nextInt();

        System.out.println("Interest Rate    Monthly Payment      Total Payment");
        for(double r = 5.0; r<= 8.0; r+= 0.125){
            double mp = (double) loanAmount*(r/100);
            double t = mp+loanAmount;
            System.out.println(r+"%             "+t/12+"              "+t);
        }
    }
}
