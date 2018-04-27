package Practice2018;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class FinchProject
{
    public static void main (final String [] args)
    {
        Finch myFinch = new Finch();
        int num1 = 0;
        int num2 = 0;
        
        while (num1 == 0)
        {
            num1 = input(myFinch);
        }

        while(!myFinch.isBeakUp()) {
        }
        
        while (num2 == 0)
        {
            num2 = input(myFinch);
        }
        
        output(calcOrientations(num1, num2, myFinch), myFinch);
        myFinch.quit();
        System.exit(0);
    }
    
    public static int input(Finch myFinch)
    {
        int c = 0;
        while (myFinch.isBeakUp())
        {
            myFinch.setLED(0, 0, 255, 500);
            myFinch.sleep(500);
            c++;
        }
        return c;
    }
    
    public static void output(int out, Finch myFinch)
    {
        myFinch.sleep(1000);
        if (out > 0)
        {
            for (int i = 0; i < out; i++)
            {
                myFinch.setLED(0, 255, 0, 500);
                myFinch.sleep(500);
            }
        }
        else if (out != 0)
            for (int i = 0; i < Math.abs(out); i++)
            {
                myFinch.setLED(255, 0, 0, 500);
                myFinch.sleep(500);
            }
        else
        {
            myFinch.setLED(255, 255, 255, 500);
            myFinch.sleep(500);
        }
    }
    //positive is green, negative is red, zero is white, first numbers are blue
    public static int calcOrientations (int one, int two, Finch myFinch)
    {
        while (true)
        {
            if(myFinch.isRightWingDown()) //add
            {
                return (one + two);
            }
            else if(myFinch.isLeftWingDown()) //subtract
            {
                return (one - two);
            }
            else if (myFinch.isFinchUpsideDown()) //multiply
            {
                return (one * two);
            }
            else if (myFinch.isBeakDown()) //divide
            {
                return (one / two);
            }
        }
    }
}
