//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;

public class OddsAndEvens
{
	public static int getSum(int[] numArray)
	{
	    int sum =0;
		for(int i= 0; i<numArray.length; i++)
		{
		 sum =sum + numArray[i];   
		}
		
	    return sum;
	    
	}
	public static int getCountOdds(int[] numArray)
	{
	    int count =0;
		for(int i=0; i<numArray.length; i++)
		{
		    if(numArray[i]%2 == 1)
		    {
		        count++;
		      }
		  }
      return count;
	}
	
	public static int[] getAllEvens(int[] numArray)
	{
	    int spot =0;
	    int help = getCountOdds(numArray);
	    int [] evens = new int [numArray.length-help];
	    for(int i=0; i<numArray.length; i++)
	    {
	        if(numArray[i]%2 ==0)
	        {
	            evens[spot] = numArray[i];
	            spot++;
	           }
	       }
    	return evens;
	}

	public static int[] getAllOdds(int[] numArray)
	{
		int spot =0;
	    int help = getCountOdds(numArray);
	    int [] odds = new int [help];
	    for(int i=0; i<numArray.length; i++)
	    {
	        if(numArray[i]%2 ==1)
	        {
	            odds[spot] = numArray[i];
	            spot++;
	           }
	       }
    	return odds;
	}
}