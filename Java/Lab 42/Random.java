import static java.lang.System.*;
import static java.lang.Math.*; 

public class Random
{
   private int minimum;
   private int maximum;
   
   public Random()
   {
       minimum = 0;
       maximum = 0;
    }
    
    public Random(int min, int max)
    {
        minimum = min;
        maximum = max;
    }
    
    public void setRange(int min,int max)
    {
       minimum = min;
       maximum = max;
    }
    
    
    public int getRandom()
    {
      return (int)(Math.random() * (maximum - minimum) + minimum);        
    }
    
   
    public String toString()
    { 
        return "Range: " + minimum + " to " + maximum + " = " + getRandom();
    }
    
   
}



