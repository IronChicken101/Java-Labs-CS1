
import java.util.Scanner;

public class Money
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int pennies, nickles, dimes, quarters, totalCents, dollars, cents;
        System.out.print("How many pennies do you have? --> ");
        pennies = keyboard.nextInt();
        System.out.println(" ");
        System.out.print("How many nickles do you have? --> ");
        nickles = keyboard.nextInt();
        System.out.println(" ");
        System.out.print("How many dimes do you have? --> ");
        dimes = keyboard.nextInt();
        System.out.println(" ");
        System.out.print("How many quarters do you have? --> ");
        quarters = keyboard.nextInt();
        System.out.println(" ");
        nickles = nickles * 5;
        dimes = dimes * 10;
        quarters = quarters * 25;
        totalCents = nickles + pennies + dimes + quarters;
        dollars = totalCents/100;
        cents = totalCents%100;
        System.out.println(" ");
        System.out.println("Total value = " + dollars +" dollers and " + cents + " cents");
        
        
        
    }
}
