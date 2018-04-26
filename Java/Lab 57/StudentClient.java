

import java.util.*;

import java.util.Arrays;

public class StudentClient
{
   
      public static void main(String[] args)
    {
        Student[] studentList = new Student [4];
        studentList[0] = new Student ("Guillermo del Toro",12);
        studentList[1] = new Student ("Meryl Streep", 11);
        System.out.println(Arrays.toString(studentList));
        System.out.println();
        studentList[1].setGrade(10);
        //System.out.println(studentList[1]);
        //for( studentList 
        
    }
}