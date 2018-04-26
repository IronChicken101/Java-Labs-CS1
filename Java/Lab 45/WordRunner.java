//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;


public class WordRunner
{
	public static void main ( String[] args )
	{
		Word obj = new Word("Hello");
		
		out.println("Original Word: " + obj);
		
		out.println("First Letter:  " + obj.getFirstChar());
		
		out.println("Last Letter:   " + obj.getLastChar());
		
		out.println("Backwards:     " + obj.getBackWards());

		out.println("");
		out.println("");
		
		
		obj.setString("World");
			out.println("Original Word: " + obj);
			out.println("First Letter:  " + obj.getFirstChar());
			out.println("Last Letter:   " + obj.getLastChar());
			out.println("Backwards:     " + obj.getBackWards());
			out.println("");
			out.println("");
		
		obj.setString("JukeBox");
			out.println("Original Word: " + obj);
			out.println("First Letter:  " + obj.getFirstChar());
			out.println("Last Letter:   " + obj.getLastChar());
			out.println("Backwards:     " + obj.getBackWards());
			out.println("");
			out.println("");
			
		obj.setString("TCEA");
			out.println("Original Word: " + obj);
			out.println("First Letter:  " + obj.getFirstChar());
			out.println("Last Letter:   " + obj.getLastChar());
			out.println("Backwards:     " + obj.getBackWards());
			out.println("");
			out.println("");
		
		obj.setString("UIL");
			out.println("Original Word: " + obj);
			out.println("First Letter:  " + obj.getFirstChar());
			out.println("Last Letter:   " + obj.getLastChar());
			out.println("Backwards:     " + obj.getBackWards());
			out.println("");
			out.println("");
		
				
	}
}