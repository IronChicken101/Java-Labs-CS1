import static java.lang.System.*;
import static java.lang.Math.*; 

public class RandomRunner
{
    public static void main(String[] args)
    {
     out.println("Random Ranges");
     out.println("");
     out.println("================\n");
     Random test = new Random(0,25); 
     System.out.println(test + "\n");
     // continue with the other 4 ranges
     //Random test = new Random(90,25);
     //out.println(test);
     test.setRange(1,3);
     out.println(test + "\n");
     test.setRange(50,100);
     out.println(test + "\n");
     test.setRange(-10,-1);
     out.println(test + "\n");
     test.setRange(-100,100);
     out.println(test + "\n");
     
     
     // Design and print in this class the ranges 6,7,8
     
    int num6 = (int)(Math.random() * 26) + 65;
    out.println("Range: " + (char)65 + " to " + (char)90 + " = " + (char)num6);
    out.println("");
    
    double range1 = Math.random() + .1;
    out.printf("Range: 0.1 to 1 = %.3f \n", range1);
    out.println();
    
    int num7 = (int)((Math.random() * (10000)) + 1000);
    out.println("Range: " + 1000 + " to " + 10000 + " = " + (int)Math.round(num7/1000)*1000); 
   

     
     
   
        
        
    }
}
