//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class PrimeRunner
{
	public static void main ( String[] args )
	{
		Prime obj = new Prime(24);
		
		out.println(obj);
		out.println();
		
		obj.setPrime(7);
		out.println(obj);
		out.println();
		
		obj.setPrime(100);
		out.println(obj);
		out.println();
		
		obj.setPrime(113);
		out.println(obj);
		out.println();
		
		obj.setPrime(113);
		out.println(obj);
		out.println();
		
		obj.setPrime(65535);
		out.println(obj);
		out.println();
		
		obj.setPrime(2);
		out.println(obj);
		out.println();
		
		obj.setPrime(7334);
		out.println(obj);
		out.println();
		
		obj.setPrime(7919);
		out.println(obj);
		out.println();
		
		obj.setPrime(1115125003);
		out.println(obj);
		out.println();	
	}	
}