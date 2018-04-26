public class Dog
{
    // instance variables
    private String name;
    private String breed;
    // constructors
    
    public Dog()
    {
        name = "";
        breed = "";
    }
    
    public Dog(String n, String m)
    {
        name = n;
        breed =m;
    }
   
    // accessor methods
    
    public String getName()
    {
        return name;
    }
    
    public String getBreed()
    {
        return breed;
    }
    // mutator methods
    public void setName(String n)
    {
        name = n;
    }
    
    public void setBreed(String m)
    {
        breed = m;
    }
	
    public String toString()
    {
        return "Name = " + name + "\nBreed = " + breed + "\n";
    }
}
