
/**
 * Write a description of class HotPepperPlant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HotPepperPlant
{
    // instance variables - replace the example below with your own
    private int plantMat;
    private int fruitMat;
    private int waterLvl;
    private int nitroLvl;
    private double height;
    private int fruitNum;
    private String fruitColor; 
    
    
    public HotPepperPlant()
    {
        // initialise instance variables
        plantMat = 5;
        fruitMat = 0;
        waterLvl = 4;
        nitroLvl = 4;
        height = 5;
        fruitNum = 0;
        fruitColor = "no peppers yet";
    }

    public HotPepperPlant (int g, int m, int w, int n, double h, int f)
    {
        maturity = m;
        waterLvl = w;
        nitroLvl = n;
        height = h;
        fruitNum = f;
        fruitColor = c;
    }
    
    public String toString()
    {
        return "Plant Maturity" + plantMat + "Fruit Maturity" + fruitMat + "Height" + height + "Water Level" + waterLvl + "Nitro Level" + nitroLvl + "Fruit Number" + fruitNum + "Fruit Color" + color;
    }
    
    //public growPlant()
    {
        
    }
    
    //public fertilizerPlant(int f)
    {
        
    }
    
    //public waterPlant(int w)
    {
        
    }
    
    //public growplant()
    {
        
    }
    
    //public pickfruit()
    {
        
    }
    
    //public fruitcolors()
    {
        
    }
    
    //public matPlant()
    {
        
    }
    
    //public killplant()
    {
        //if (fertilizerPlant > 10 || waterPlant > 10 || matPlant => 100) 
        {
            //ystem.out.println("plant is dead")
        }
    }
}
