import java.util.Arrays;
import java.util.*;

public class Inventory
{
        private int numBooks; 
        private Book[] books;     
    public static void main(String[] args)
    {
        Inventory app = new Inventory();
        app.addBooks();
        app.printBooks();
    }
    public Inventory()
    {
        books = new Book[20];  // instantiate array with length 20
        numBooks = 0;          // no books added yet
    }
    public void addBooks()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("***********************");
        System.out.println("*    addBooks    *");
        System.out.println("***********************");
        numBooks = 0;
        String reply = "y";
        while(reply.equals("y"))
        {
            System.out.print("Enter The Student's Name ---> ");
            String name = keyboard.nextLine();
            System.out.print("Enter Book's Number ---> ");
            String number = keyboard.nextLine();           
            books[numBooks] = new Book(name, number);
            numBooks = numBooks + 1;          
            System.out.print("\nEnter another student and book?(y/n) --> ");
            reply = keyboard.nextLine();
            System.out.println();           
        }
    }    
    public void printBooks()
    {
       System.out.println("************************");
       System.out.println("*    printBooks  *");
       System.out.println("************************");     
       for(int i=0; i<books.length; i++)
       {
           if(!(books[i] == null))
            {
                System.out.println(books[i]);
                System.out.print("\n");
            }           
       }
    }
}

