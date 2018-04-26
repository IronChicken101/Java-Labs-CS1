//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class OddsAndEvensRunner
{
	public static void main( String args[] )
	{
		int [] one = {2,5,6,8,10,12,14};
		System.out.println("Original array = " + Arrays.toString(one));
		System.out.println("sum all numbers "+ OddsAndEvens.getSum(one));
		System.out.println("# of odds = " + OddsAndEvens.getCountOdds(one));
		int [] three = new int [OddsAndEvens.getCountOdds(one)];
		three =OddsAndEvens.getAllOdds(one);
		System.out.println("odds = " + Arrays.toString(three));
		int [] two = new int [one.length - OddsAndEvens.getCountOdds(one)];
		two =OddsAndEvens.getAllEvens(one);
		System.out.println("Evens = " + Arrays.toString(two));
		
		System.out.println();
		
		int [] four = {1,2,3,4,5,6,7,8,9};
		System.out.println("Original array = " + Arrays.toString(four));
		System.out.println("sum all numbers "+ OddsAndEvens.getSum(four));
		System.out.println("# of odds = " + OddsAndEvens.getCountOdds(four));
		int [] five = new int [OddsAndEvens.getCountOdds(four)];
		five =OddsAndEvens.getAllOdds(four);
		System.out.println("odds = " + Arrays.toString(five));
		int [] six = new int [one.length - OddsAndEvens.getCountOdds(four)];
		six =OddsAndEvens.getAllEvens(four);
		System.out.println("Evens = " + Arrays.toString(six));
		
		System.out.println();
		
		int [] seven = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};
		System.out.println("Original array = " + Arrays.toString(seven));
		System.out.println("sum all numbers "+ OddsAndEvens.getSum(seven));
		System.out.println("# of odds = " + OddsAndEvens.getCountOdds(seven));
		int [] eight = new int [OddsAndEvens.getCountOdds(seven)];
		eight =OddsAndEvens.getAllOdds(seven);
		System.out.println("odds = " + Arrays.toString(eight));
		int [] nine = new int [one.length - OddsAndEvens.getCountOdds(seven)];
		nine =OddsAndEvens.getAllEvens(seven);
		System.out.println("Evens = " + Arrays.toString(nine));
		
		
		
		
		
	}
}