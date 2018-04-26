

public class CarRunner
{
    public static void main(String[] args)
    {
        Car carOne = new Car();
        Car carTwo = new Car("purple",4,6,true);
        
        System.out.println(carOne);
        System.out.println(carTwo);
        
        System.out.println("\n" + carOne.isRunning());
        System.out.println(carTwo.isRunning());
    }
}