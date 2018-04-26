import static java.lang.System.*;

public class LetterRemoverRunner

{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover("I am Sam I am", "a");//add test cases
		out.println(test);
		out.println(" ");
		LetterRemover test2 = new LetterRemover("ssssssssxssssesssssesss", "s");
		out.println("ssssssssxssssesssssesss - letter to remove s");
		out.println("xee");
		out.println(" ");
		LetterRemover test3 = new LetterRemover("qwertyqwertyqwerty", "a");
		out.println(test3);
		out.println(" ");
		LetterRemover test4 = new LetterRemover("abababababa", "b");
		out.println(test4);
		out.println(" ");
		LetterRemover test5 = new LetterRemover("abaababababa", "x");
		out.println(test5);
		
		
											
	}
}