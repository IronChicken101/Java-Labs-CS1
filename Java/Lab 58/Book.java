public class Book
{
    private String studentName;
    private String bookNumber;
    public Book()
    {
        studentName = "";
        bookNumber = "";
    }
    public Book(String s, String b)
    {
        studentName = s;
        bookNumber = b;
    }
    public String getstudentName()
    {
        return studentName;
    }
    public String getbookNumber()
    {
        return bookNumber;
    }
    public void setstudentName(String s)
    {
        studentName = s;
    }
    public void setbookNumber(String b)
    {
        bookNumber = b;
    }
    public String toString()
    {
       return "Student's name is " + studentName  + "\nBook number is " + bookNumber;    
    }
}

