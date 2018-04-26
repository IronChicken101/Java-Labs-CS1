import static java.lang.System.*;

public class WordFunRunner
{
	public static void main( String args[] )
	{
	   WordFun test = new WordFun("Hello World");
	   test.makeUpper();
	   test.addHyphen();
	   out.println(test);

	   WordFun test1 = new WordFun ("Jim Bob");
	   test1.makeUpper();
	   test1.addHyphen();
	   out.println(test1);
	   
	   WordFun test2 = new WordFun("Computer Science");
	   test2.makeUpper();
	   test2.addHyphen();
	   out.println(test2);
	   
	   WordFun test3 = new WordFun("UIL TCEA");
	   test3.makeUpper();
	   test3.addHyphen();
	   out.println(test3);
	   
	   WordFun test4 = new WordFun ("State Champions");
	   test4.makeUpper();
	   test4.addHyphen();
	   out.println(test4);
	   //add more test cases

	}
}