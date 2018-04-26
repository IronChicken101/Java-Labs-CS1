import java.util.*;
import java.util.Arrays;

public class StudentClient1
{
    //instance variable
    private Student[] studentList;
    
    //Main Method
  public static void main(String[] args)
    {
        StudentClient1 app = new StudentClient1();
        app.addStudents();
        app.printStudents();
        
    }
    
    // Constructor
    public StudentClient1()
    {
        studentList = new Student[4];
        
    }
    
    public void addStudents()
    {
        Scanner keyboard = new Scanner(System.in);
        String answer = "y";
        int numStudents = 0;
        while(answer.equals("y"))
        {
            System.out.print("Enter student name ---> ");
            String name = keyboard.nextLine();
            System.out.print("Enter student grade ---> ");
            int grade = keyboard.nextInt();
            studentList[numStudents] = new Student (name,grade);
            numStudents++;
            keyboard.nextLine();
            System.out.print("\nEnter another student (y/n) ?---> ");
            answer = keyboard.nextLine();
            System.out.println();
        }
    
    }
    
    public void printStudents()
    {
        for(int i=0; i < studentList.length; i++)
        {
           System.out.print(studentList[i]);
           System.out.println();
           
        }
    }
}

