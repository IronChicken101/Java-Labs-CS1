
import java.util.Scanner;
public class RectangleStudent
{
    public static void main(String[] args)
     {
     int length, width, perimeter, area; //Declare variables
     Scanner keyboard = new Scanner(System.in); //Create Scanner Keyboard
     System.out.print("Enter the length:");
     length = keyboard.nextInt();
     System.out.print("Enter the width:");
     width = keyboard.nextInt();
     System.out.println();
     System.out.println();
     
     perimeter = 2 * width + 2 * length;
     area = width * length;
     
     System.out.println("Perimeter = " + perimeter);
     System.out.println("Area = " + area);
     
     
    }
}
