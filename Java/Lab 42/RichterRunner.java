import static java.lang.System.*; 
import java.util.Scanner;
public class RichterRunner
{
    
    public static void main (String [] args)
    {
        double response;
        Richter test;
        test = new Richter();
        
        Scanner keyboard = new Scanner(System.in);
        
        out.print("Enter a magnitude on the Richter scale ==>> ");
        response = keyboard.nextDouble();
        test.setMagnitude(response);
        out.println(test.calcDamage());
        
        out.print("Enter a magnitude on the Richter scale ==>> ");
        response = keyboard.nextDouble();
        test.setMagnitude(response);
        out.println(test.calcDamage());
        
        out.print("Enter a magnitude on the Richter scale ==>> ");
        response = keyboard.nextDouble();
        test.setMagnitude(response);
        out.println(test.calcDamage());
        
        //out.print("Enter a magnitude on the Richter scale ==>> ");
        //response = keyboard.nextDouble();
        //test.setMagnitude(response);
        //out.println(test.calcDamage());
        
        //out.print("Enter a magnitude on the Richter scale ==>> ");
        //response = keyboard.nextDouble();
        //test.setMagnitude(response);
        //out.println(test.calcDamage());
        
        //out.print("Enter a magnitude on the Richter scale ==>> ");
        //response = keyboard.nextDouble();
        //test.setMagnitude(response);
        //out.println(test.calcDamage());
        
        //out.print("Enter a magnitude on the Richter scale ==>> ");
        //response = keyboard.nextDouble();
        //test.setMagnitude(response);
        //out.println(test.calcDamage());
        
        
        
        
        
        
        
        
    }
}
