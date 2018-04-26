//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Carmichael Deiparine
//Date- 2/28/18
//Class- TriangleWordRunner
//Lab- Lab 53

import static java.lang.System.*;

public class TriangleWordRunner1
{
   public static void main(String args[])
   {
       TriangleTwo test = new TriangleTwo();
       test.setTriangle(3,"A");
       System.out.println(test);
       
       test.setTriangle(7,"X");
       System.out.println(test);
       
       test.setTriangle(1,"R");
       System.out.println(test);
       
       test.setTriangle(5,"T");
       System.out.println(test);
       
       test.setTriangle(4,"W");
       System.out.println(test);
   }
}