
/**
 * Write a description of class Factorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Factorial
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print ("Enter a number ---> ");
        int number = keyboard.nextInt();
        
        for (int i = 1; i <= number; i++) 
        {
            long factorial = 1;
            for(int num = 1; num <= i; num++)
          {
            factorial = num*factorial;
          }
          System.out.println(i + "! is " + factorial);
        }
    }
}
