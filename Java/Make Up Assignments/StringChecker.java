import static java.lang.System.*;

public class StringChecker
{
	private String word, lookingFor;
	private boolean truth;

	public StringChecker(String s)
	{
		setString(s);
	}

   public void setString(String s)
   {
   		word=s;
   }

 	public boolean findLetter(String c)
	{
		lookingFor = c;
		truthRunner();
		return truth;
	} 

	public boolean findSubString(String s)
	{
		lookingFor = s;
		truthRunner();
		return truth;
	}

 	public void truthRunner()
   {
   		if (word.lastIndexOf(lookingFor) >= 0 )
			{
				truth = true;		
			}
		if (word.lastIndexOf(lookingFor) < 0)
			{
				truth = false;		
			}
   }
   
   public String toString()
 	{
 		return word + "\n\n";
	}
}