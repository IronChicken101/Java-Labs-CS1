// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class DigitCounter
{
   	private int number;

   	public DigitCounter(int num)
   	{
   	    setNumber(num);
   	}

	public void setNumber(int num)
	{
	   number = num;

	}

	public int countDigits( )
	{
		int sum=0;
		while(number>0)
		{
		    number = number/10;
		    sum = sum + 1;
		    
		    
		    
		
		    
		  }

		return sum; 
	}

	public String toString()
	{
		return number + " contains " + countDigits() + " digits.";
	}
}