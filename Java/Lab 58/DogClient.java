import java.util.*;

public class DogClient
{
    // instance variable
    private Dog[] dogs;     // declare array variable

public static void main(String[] args)
    {
        DogClient app = new DogClient();
        app.addDogs();
        app.printDogs();
    }
    public DogClient()
    {
        dogs = new Dog[5];  // instantiate array with length 5
    }

    /* This method allows a user input information about 5 dogs and
     * stores this information in the array dogs.
     */
    public void addDogs()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("************************");
        System.out.println("*        addDogs       *");
        System.out.println("************************");

       
        for(int i=0; i<dogs.length; i++)
        {
            System.out.print("Enter Dog Name -->");
            String Name = keyboard.nextLine();
            System.out.print("Enter dog breed -->");
            String Breed = keyboard.nextLine();
            dogs[i] = new Dog(Name,Breed);
            System.out.println();
        }

    }

    /* This method displays the name and breed for each Dog in the array.
     */
    public void printDogs()
    {
        System.out.println("************************");
        System.out.println("*      printDogs       *");
        System.out.println("************************");
        for(int x=0; x<dogs.length; x++)
        {
            System.out.print(dogs[x]);
            System.out.println();
        }

 }

    }
