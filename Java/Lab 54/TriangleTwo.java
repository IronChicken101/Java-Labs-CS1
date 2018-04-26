//(c) A+ Computer Science
//www.apluscompsci.com
//Name- Carmichael Deiparine
//Date- 2/28/18
//Class- TriangleTwo
//Lab- Lab 53

import static java.lang.System.*;

public class TriangleTwo
{
    private int size;
    private String letter;

	public TriangleTwo()
	{
	    size = 0;
	    letter = "";
	}

	public TriangleTwo( String let, int sz)
	{
	    letter = let;
	    size = sz;
	}

	public void setTriangle(int count, String let)
	{
	    letter = let;
	    size = count;
	}

	public String getLetter()
	{
		return "#";
	}

	public String toString()
	{
		String output="";
		for(int rows = 1; rows <= size; rows++)
		{
		    for(int s = size; s >= rows; s--)
		    {
		        output+= letter;
		    }
		    output += "\n";
		}
		return output+"\n";
	}
}