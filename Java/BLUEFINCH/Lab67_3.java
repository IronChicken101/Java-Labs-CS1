package Practice2018;

import java.awt.Color;
import java.util.Arrays;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class Lab67_3
{

   public static void main(final String[] args)
   {
	  // Instantiating the Finch object
      Finch myFinch = new Finch();
             
      while(!myFinch.isBeakUp()) 
      {
          if(!myFinch.isObstacle()) {
    		  myFinch.setWheelVelocities(100,100);
    		  System.out.println("Moving Foreward");
    		  myFinch.sleep(500);
    	  }
    	  else
    	  {
    	      myFinch.stopWheels();
    	      myFinch.sleep(500);
    	      System.out.println("Sitting Still");
    	   }
    	  
    	  if(myFinch.isLeftWingDown())
    	  {
    	      System.out.println("Left Wing Down");
    	   }
    	   
    	  if(myFinch.isRightWingDown())
    	  {
    	      System.out.println("Right Wing Down");
    	   }
    	   
    	   if(myFinch.isFinchUpsideDown()) {
    		  System.out.println("Upside Down");
    		 
    	  }
    	  
    	  if(myFinch.isBeakUp()) {
    		  System.out.println("Beak Up");
    		 
    	  }
    	  if(myFinch.isBeakDown()) {
    		  System.out.println("Beak Down");
    		  myFinch.sleep(500);
    	  }
    	  
    	  double x = myFinch.getXAcceleration();
    	  double y = myFinch.getYAcceleration();
    	  double z = myFinch.getZAcceleration();
    	  
    	  System.out.println("X: " + x + ", Y: " + y + ", Z: " + z);
    	  
    	  myFinch.sleep(3000);
      }


      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
    }
}

