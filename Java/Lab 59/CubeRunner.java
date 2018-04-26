public class CubeRunner
{
    public static void main(String[] args)
    {
        Cube cub1 = new Cube ("Yellow",6,4);
        System.out.println(cub1);
        
        System.out.print("When I roll my cube of  " + cub1.getNumFaces() + " sides 10 times, I get:   ");
        printRolling(cub1); // call static method using ref. variable cub1
    
       cub1.setNumFaces(8);
       
       System.out.println();
       System.out.print("When I roll my cube of  " + cub1.getNumFaces() + " sides 10 times, I get:   ");
       printRolling(cub1);
    }
    
        public static void printRolling(Cube cub1)
        {
        for(int i = 0; i<= 10; i++)
        {
            cub1.roll();
            System.out.print(cub1.getFaceValue() + ", ");
        }
    }
   }

