//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;
public class HexToBinaryRunner
{
    public static void main( String args[] )
    {
        Scanner keyboard = new Scanner(System.in);
        
        
        
        out.print("Enter a letter :: ");
        char hexChar = keyboard.next().charAt(0);
        
        HexToBinary test = new HexToBinary(hexChar);
        
        out.println(test);
        
        out.print("\nEnter a letter :: ");
        hexChar = keyboard.next().charAt(0);
        
        test.setHex(hexChar);
        out.println(test);
        
        out.print("\nEnter a letter :: ");
        hexChar = keyboard.next().charAt(0);
        
        test.setHex(hexChar);
        out.println(test);
        
        out.print("\nEnter a letter :: ");
        hexChar = keyboard.next().charAt(0);
        
        test.setHex(hexChar);
        out.println(test);
        
        out.print("\nEnter a letter :: ");
        hexChar = keyboard.next().charAt(0);
        
        test.setHex(hexChar);
        out.println(test);
        
        out.print("\nEnter a letter :: ");
        hexChar = keyboard.next().charAt(0);
        
        test.setHex(hexChar);
        out.println(test);
        
        out.print("\nEnter a letter :: ");
        hexChar = keyboard.next().charAt(0);
        
        test.setHex(hexChar);
        out.println(test);

    }
}