package Practice2018;



import java.awt.Color;
import java.util.Arrays;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
public class Lab67_2
{
    public static void main(final String[] args)
{
    Finch myFinch = new Finch();
        boolean[] obstacle = new boolean[2];
        obstacle = myFinch.getObstacleSensors();
        while(!myFinch.isBeakUp())
        {
            myFinch.sleep(100);
        }
    if(myFinch.isBeakUp())
    {
    
        while(!myFinch.isObstacle())
        {
            myFinch.setWheelVelocities(100,100);
         

        }
    }
    //if(myFinch.isObstacle())
    //{
        
    
    while(!myFinch.isBeakDown())
    {
         myFinch.setWheelVelocities(-100,-100);
         myFinch.sleep(100);
     while(myFinch.isBeakDown())
     {
         myFinch.quit();
         System.exit(0);
        }
   // }
}

}
}
