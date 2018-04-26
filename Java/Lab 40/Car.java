
public class Car
{
    private String color;
    private int numWheels;
    private int peopleCapacity;
    private boolean runningNow;
    
    public Car()
    {
        color = "blank";
        numWheels = 4;
        peopleCapacity = 5;
        runningNow = false;
    }
    
    public Car(String c, int n, int p, boolean r)
    {
        color = c;
        numWheels = n;
        peopleCapacity = p;
        runningNow = r;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public int getNumWheels()
    {
        return numWheels;
    }
    
    public int getPeopleCapacity()
    {
        return peopleCapacity;
    }
    
    public boolean getRunningNow()
    {
        return runningNow;
    }
    
    public void setNumWheels(int nW)
    {
        numWheels = nW;
    }
    
    public void setColor(String newColor)
    {
        color = newColor;
    }
    
    public void setPeopleCapacity(int pC)
    {
        peopleCapacity = pC;
    }
    
    public void setRunningNow(boolean r)
    {
        runningNow = r;
    }
    
    public  String isRunning()
    {
       if(runningNow)
       {
         return "I'm traveling";   
        }
        return "I want to travel";
        
    }
    public String toString()
    {
        return "this car is " + color + ", has a seating capacity of " + peopleCapacity + " and is running = " + runningNow;
    }
    
}  
    
    
    