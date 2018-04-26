

public class CalAverage
{
   
   public static void main(String[] args)
   {
      
      
      CalAverage.avg(5,5);
      CalAverage.avg(90,100);
      CalAverage.avg(100,85.8);
      CalAverage.avg(-100,55);
      //complete code
      
       
       
    }
    
    public static  void avg (double num1, double num2)
    {
        
        
        double ave;
        ave = (num1 + num2)/2;
        System.out.print(num1 + " + " + num2 + " has an average of ");
        System.out.printf("%.2f\n\n", ave);
        
    }
    
    
    
    
        
}