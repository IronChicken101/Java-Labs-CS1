

public class Rectangle
{
    public static void main(String[] args)
    {
        System.out.println("The perimeter is :: " + Rectangle.calcPerimeter(2,6) + "\n");
        System.out.println("The perimeter is :: " + Rectangle.calcPerimeter(12,5) + "\n");
        System.out.println("The perimeter is :: " + Rectangle.calcPerimeter(131,75) + "\n");
        System.out.println("The perimeter is :: " + Rectangle.calcPerimeter(20,25) + "\n");
        System.out.println("The perimeter is :: " + Rectangle.calcPerimeter(9,256) + "\n");
        System.out.println("The perimeter is :: " + Rectangle.calcPerimeter(36,72) + "\n");
    }
    
    public static int calcPerimeter(int length, int width)
    {
        return 2*length + 2*width;
    }
}
