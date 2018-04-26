import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );
		Distance test = new Distance();

		out.print("Enter X1 :: ");
		int xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int yTwo = keyboard.nextInt();
		System.out.println("");

		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test.determineClosest());
		System.out.println("");
		System.out.println("");

		out.print("Enter X1 :: ");
		xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		yTwo = keyboard.nextInt();
		System.out.println("");

		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test.determineClosest());
		System.out.println("");
		System.out.println("");


		out.print("Enter X1 :: ");
		xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		yTwo = keyboard.nextInt();
		System.out.println("");

		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test.determineClosest());
		System.out.println("");
		System.out.println("");
		
		out.print("Enter X1 :: ");
		xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		yTwo = keyboard.nextInt();
		System.out.println("");

		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test.determineClosest());
		}
}