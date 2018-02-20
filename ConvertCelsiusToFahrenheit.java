import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextInt();
		double fahrenheit = 9.0 / 5 * celsius + 32;
		System.out.println(celsius + " Celsius is " + fahrenheit + " in Fahrenheit"); 
	}
}