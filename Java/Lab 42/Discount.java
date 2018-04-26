
import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
    public static void main( String args[] )
    {
        Scanner keyboard = new Scanner(System.in);
        double dis = 0.15;
        double total;
        
        out.print("Enter the original bill amount :: ");
        double amt = keyboard.nextDouble();
        
        total = Total(amt,dis);
        out.println("Bill after discount :: " +total);
        
        out.print("Enter the original bill amount :: ");
        double amt1 = keyboard.nextDouble();
        
        total = Total(amt1,dis);
        out.println("Bill after discount :: " +total);
        
        out.print("Enter the original bill amount :: ");
        double amt2 = keyboard.nextDouble();
        
        total = Total(amt2,dis);
        out.println("Bill after discount :: " +total);
        
        out.print("Enter the original bill amount :: ");
        double amt3 = keyboard.nextDouble();
        
        total = Total(amt3,dis);
        out.println("Bill after discount :: " +total);
    }
    static double Total (double num1,double num2)
    {
        if (num1 > 2000)
       {
           double tot = discount (num1, num2);
           return tot;
       }
       else
       {
           double tot = num1;
           return tot;
        }
    }
    static double discount(double num1, double num2)
    {
        double disTotal = (num1 - (num1 * num2)); 
        return disTotal;
       }
}

