//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LoopStatsRunner
{
	public static void main ( String[] args )
	{
		LoopStats obj = new LoopStats(1, 5);

		
		out.println(obj);

		out.println("Total :  " + obj.getTotal());
		
		out.println("Even count : " + obj.getEvenCount());
		
		out.println("Odd count :   " + obj.getOddCount());

		out.println("");
		out.println("");
		
		obj.setNums(2,8);
			out.println(obj);
			out.println("Total :  " + obj.getTotal());
			out.println("Even count : " + obj.getEvenCount());
			out.println("Odd count :   " + obj.getOddCount());
			out.println("");
			out.println("");
			
		obj.setNums(5,15);
			out.println(obj);
			out.println("Total :  " + obj.getTotal());
			out.println("Even count : " + obj.getEvenCount());
			out.println("Odd count :   " + obj.getOddCount());
			out.println("");
			out.println("");
		// add test cases
		
		
		
				
	}
}
