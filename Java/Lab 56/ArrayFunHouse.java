//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.lang.System;
import java.lang.Math;

public class ArrayFunHouse
{
	

	//getSum() will return the sum of the numbers from start to stop, 
	public static int getSum(int[] numArray, int start, int stop)
	{
		int sum = 0;
		for(int count = start; count <= stop; count++)
		{
		    sum += numArray[count];
		  }
	    
	    
	    return sum;
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
		int count = 0;
        for(int i=0; i<numArray.length; i++)
        {
            if(numArray[i] == val)
            {
                count++;
            }
        }
       
        return count; 
	}

	public static int[] removeVal(int[] numArray, int val)
	{
		int[] newArray = new int[numArray.length - getCount (numArray,val)];
        //int j = 0;
        for(int i = 0; i< numArray.length; i++)
        {
            if(numArray[i] != val)
            {
                newArray[i] = numArray[i];
                i++;
                }
        }
        
	    return newArray;
	}
}