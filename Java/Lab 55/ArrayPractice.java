import java.util.*;
public class ArrayPractice
{
public void method1()
{
    int[] array1 = new int[5];
    array1 [0] = 2;
    array1 [1] = 4;
    array1 [2] = 6;
    array1 [3] = 8;
    array1 [4] = 10;
    
    
         for (int item: array1)
    {
         System.out.print(item + " ");
     }
     System.out.println(" ");
     
}
public void method2()
{
    System.out.println(" ");
    int[] array2 = {10,20,30,40,50};
         for (int item: array2)
    {
         System.out.print(item + " ");
     }
     System.out.println(" ");
}
public void method3()
{
    System.out.println(" ");
    double[] array3 = new double[4];
    array3 [0] = 5.6;
    array3 [1] = 9.9;
    array3 [2] = 0.0;
    array3 [3] = 0.0;
         for (double item: array3)
    {
         System.out.print(item + " ");
     }
    System.out.println(" ");
}
public void method4()
{
    System.out.println(" ");
    String[] array4 = new String[3];
    array4 [0] = "Dog";
    array4 [2] = "Cat";
         for (String item: array4)
    {
         System.out.print(item + " ");
     }
}
public static void main(String[] args)
{
    ArrayPractice app = new ArrayPractice();
    app.method1();
    app.method2();
    app.method3();
    app.method4();
}
}
