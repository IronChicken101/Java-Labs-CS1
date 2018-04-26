

public class Student
{
   //instance variables
    
    private String name;
    private int grade;
    
    // constructors
    
    public Student()
  {
      name = "";
      grade = 9;
   }
   
   public Student(String n, int g)
   {
       name = n;
       grade = g;
    }
    // accessors methods
    public String getName()
    {
        return name;
    }
    
    public int getGrade()
    {
        return  grade;
    }
    // mutator methods
    public void setName(String n)
    {
        name = n;
    }
    
    public void setGrade(int g)
    {
        grade = g;
    }
    
    public String toString()
    {
        
       return "Name is " + name  + ", and grade is " + grade; 
    }
    
}