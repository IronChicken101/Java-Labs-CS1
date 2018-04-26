//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 8 - #2  Box    2016

// Uses files BoxRunner.java and Box.java


public class BoxRunner
{
	public static void main ( String[] args )
	{
		out.println("Lab Chapter 8 - #2  Box    2016");
		out.println();
		out.println();
		
		// ***** fill in your name
		out.println("My name is Sam Hollenbeck");
		out.println();		
		out.println();		
		
		Box obj = new Box("hippo");
		obj.print();
		
		obj.setWord("abcd");
		obj.print();
		
		obj.setWord("it");
		obj.print();
		
		obj.setWord("a");
		obj.print();
		
		obj.setWord("chicken");
		obj.print();
	}
}