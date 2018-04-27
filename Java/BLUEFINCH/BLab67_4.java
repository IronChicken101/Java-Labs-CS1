package Practice2018;

import java.awt.Color;
import java.util.Arrays;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
public class BLab67_4
{
    
    

   public static void main(final String[] args)
    {
        Finch myFinch = new Finch();
        int i = 0;
         while(!myFinch.isBeakUp())
        {
            myFinch.sleep(100);
        }
       while(myFinch.isBeakUp())
       {
           myFinch.setLED(100,200,255,500);
           myFinch.sleep(1000);
           i++;
           System.out.println(i);
        }
            for(int c = i; c>0;c=c-1)
            {
                myFinch.setLED(255,200,100,500);
                myFinch.sleep(1000);
            }
             myFinch.quit();
      System.exit(0);
        
    }
    


}