package Practice2018;
 
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class Lab67_1
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();
      
      //for(int i=1; i<5; i++)
      //{
          //myFinch.setLED(0,0,0);
        //}9
      for(int i=1; i<=5; i++)
      {
          myFinch.setLED(0,0,255,1000);
          myFinch.sleep(1000);
      }

      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
      }
   }

