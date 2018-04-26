//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;
	private double quadA, quadB, quadC;
	
	public Quadratic()
	{
		setEquation(0,0,0);
		rootOne=0.0;
		rootTwo=0.0;

	}

	public Quadratic(int a, int b, int c)
	{
		setEquation(a, b, c);

	}

	public void setEquation(int a, int b, int c)
	{
		quadA = a;
		quadB = b;
		quadC = c;

 	}

	public void calcRoots( )
	{
		rootOne = (-1*(quadB) + Math.sqrt((quadB*quadB) - ((4*quadA)*quadC))) / (2*quadA);
		rootTwo = (-1*(quadB) - Math.sqrt((quadB*quadB) - ((4*quadA)*quadC))) / (2*quadA);
	}

	public void print( )
	{
		System.out.println();
		System.out.println();
		System.out.printf("rootone :: " + "%.2f\n",rootOne);
		System.out.printf("roottwo :: " + "%.2f\n",rootTwo);
		System.out.print("\n\n\n\n");

	}
}