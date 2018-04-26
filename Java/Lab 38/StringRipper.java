public class StringRipper {
   public static void main(String[] args) {
      String str1, str2, str3, str4;
      str1 = "chicken";
      str2 = "Alligator";
      str3 = "COMPUTER SCIENCE IS THE BEST!";
      str4 = "I like fried chicken and mashed potatoes!";
      
      System.out.println(str1.substring(3, 6));
      System.out.println(str1);
      System.out.println();
      
      System.out.println(str2.substring(3, 8));
      System.out.println(str2);
      System.out.println();
      
      System.out.println(str3.substring(9, 12));
      System.out.println(str3.substring(0, 12));
      System.out.println(str3.substring(5, 12));
      System.out.println(str3);
      System.out.println();
      
      System.out.println(str4.substring(0, 7));
      System.out.println(str4.substring(7, 15));
      System.out.println(str4.substring(15, 26));
      System.out.println(str4.substring(22, 26));
      System.out.println(str4);
   }
}
