
public class StringName
{
    	 public static void main(String[] args) {
      Name person1 = new Name("Sally Baker");
      System.out.println(person1.getFirst());
      System.out.println(person1.getLast());
      System.out.println(person1.getName());
      System.out.println();
      
      Name person2 = new Name("John Doe");
      System.out.println(person2.getFirst());
      System.out.println(person2.getLast());
      System.out.println(person2.getName());
      System.out.println();
      
      Name person3 = new Name("Sammy Lammy");
      System.out.println(person3.getFirst());
      System.out.println(person3.getLast());
      System.out.println(person3.getName());
      System.out.println();
      
      Name person4 = new Name("Benny Programmer");
      System.out.println(person4.getFirst());
      System.out.println(person4.getLast());
      System.out.println(person4.getName());
      System.out.println();
      
      Name person5 = new Name("Sandy Painter");
      System.out.println(person5.getFirst());
      System.out.println(person5.getLast());
      System.out.println(person5.getName());
      System.out.println();
   }  
} 

class Name {
  static String name;
  static String first;
  static String last;
   
   
   public Name(String str) {
      this.name = str;
   }
   public String getName() {
      return name;
   }
   public String getFirst() {
      first = name.substring(0, name.indexOf(" "));
      return first;
   }
   public String getLast() {
      last = name.substring(name.indexOf(" ") + 1, name.length());
      return last;
   }
}


