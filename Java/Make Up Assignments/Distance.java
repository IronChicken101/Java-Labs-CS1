import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;

	public Distance()
	{
			x1 = 0;
			y1 = 0;
			x2 = 0;
			y2 = 0;

	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
			setCoordinates(xOne, yOne, xTwo, yTwo);

	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
			x1 = xOne;
			y1 = yOne;
			x2 = xTwo;
			y2 = yTwo;

	}

	public String determineClosest( )
	{
		double distanceA = (Math.sqrt((x1*x1) + (y1*y1)));
		double distanceB = (Math.sqrt((x2*x2) + (y2*y2)));
		String answer = "";
				if (distanceA > distanceB)
					{
						answer = "B is closer to (0,0).";
					}
				if (distanceB > distanceA)
					{
						answer = "A is closer to (0,0).";
					}
				if (distanceB == distanceA)
					{
						answer ="The distance is equal.";
					}
				return answer;
	}

	public String toString()
	{
		return determineClosest();
	}
}