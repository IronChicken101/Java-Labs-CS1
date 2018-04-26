//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MultTable
{
    private int number;
    private int stop;

    public MultTable()
    {
        number = stop = 0;
    }


    public MultTable(int num, int end)
    {
        setTable(num, end); 
    } 
    
    public void setTable(int num, int end)
    {
        number = num;
        stop = end; 
    }  




    public void printTable( )
    {
        
        out.println("Multiplication table for " + number);
        
        
        for (int i = 0;   i <= stop;  i++)
        
        System.out.println( i + "     " + i*number);
        
        
        
       
        System.out.println();
        System.out.println();
        
        
        
        
        
    }
}