import static java.lang.System.*; 

public class CheckerRunner
{
	public static void main ( String[] args )
	{
		StringChecker test = new StringChecker("chicken");
		out.println("looking for c " + test.findLetter("c"));
		out.println("looking for ch " + test.findSubString("ch"));
		out.println("looking for x " + test.findSubString("x"));
		out.println(test);
		
		test.setString("alligator");
		out.println("looking for g "+test.findLetter("g"));
		out.println("looking for all "+test.findSubString("all"));
		out.println("looking for gater "+test.findSubString("gater"));
		out.println(test);

		test.setString("COMPUTER SCIENCE IS THE BEST!");
		out.println("looking for U "+test.findLetter("U"));
		out.println("looking for COMP SCI "+test.findSubString("COMP SCI"));
		out.println("looking for SCIENCE "+test.findSubString("SCIENCE"));
		out.println(test);
	}
}