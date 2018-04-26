import static java.lang.System.*;

public class DivisorsRunner
{
    public static void main( String args[] )
    {
        Divisors test = new  Divisors (10);
        out.println(test+ "\n");
        
        Divisors test1 = new  Divisors (45);
        out.println(test1+ "\n");
        
        
        Divisors test2 = new  Divisors (14);
        out.println(test2+ "\n");
        
        
        Divisors test3 = new  Divisors (1024);
        out.println(test3+ "\n");
        
        
        Divisors test4 = new  Divisors (1245);
        out.println(test4+ "\n");
        
        
        Divisors test5 = new  Divisors (33);
        out.println(test5+ "\n");
        
        
        Divisors test6 = new  Divisors (65535);
        out.println(test6+ "\n");
    }
}