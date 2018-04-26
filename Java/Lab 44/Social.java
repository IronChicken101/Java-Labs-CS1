//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

    public Social()
    {
       socialNum = "";
       sum = 0;
    }

    public Social(String soc)
    {   
        socialNum = soc;
       
    }


    public void setWord(String w)
    {
        socialNum = w;
    }

    public void chopAndAdd()
    {
        int loc = socialNum.indexOf("-");
        int loc2 = socialNum.indexOf("-");
                
         String sub1 = socialNum.substring(0,loc);
        loc = loc + 1;
        String sub2 = socialNum.substring(loc,loc2);
        loc2 = loc2 = 1;
        String sub3 = socialNum.substring(loc2);
        
        Integer.parseInt(sub1);
        Integer.parseInt(sub2);
        Integer.parseInt(sub3);
        
        ///sum = sub1 + sub2 + sub3;
        
        
        
        
        
        
        
    }

    public String toString()
    {
        return "SS# " + socialNum + " has a total of " + sum + "\n";
    }
}