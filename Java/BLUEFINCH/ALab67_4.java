package Practice2018;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
public class ALab67_4
{
   public static void main(final String[] args)
   {
      Finch myFinch = new Finch();
      
      int num = 1 + (int)(Math.random() * 4);
      
      input(myFinch,num);
      myFinch.sleep(1000);
      output(myFinch,num);
      
      myFinch.quit();
      System.exit(0);
   }
   
   public static void input(Finch myFinch, int num)
   {
    while(!myFinch.isBeakUp())
    {
            myFinch.sleep(100);
    }
    if(myFinch.isBeakUp())
    {
       for(int i=0;i<=num; i++)
      {
          myFinch.setLED(0,0,255,1000);
          myFinch.sleep(100);
      }
    } 
   }
   
   public static void output(Finch myFinch, int num)
   {
     while(!myFinch.isFinchLevel())
    {
            myFinch.sleep(100);
    }
      if(myFinch.isFinchLevel())
    {
       for(int i=0;i<=num; i++)
      {
          myFinch.setLED(0,0,255,1000);
          myFinch.sleep(100);
      }
    }
  }
}