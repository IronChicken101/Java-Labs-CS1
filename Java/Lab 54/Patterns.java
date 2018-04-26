import java.util.*;

public class Patterns {
 public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter number ---> ");
        int num = keyboard.nextInt();
        
        System.out.println();
        
        for(int x = 1; x <= num; x++) {
           for (int y = 1; y <= x; y++) 
            System.out.print("*");
           System.out.println();
        }
        for(int x = num; x >= 1; x--) {
           for (int y = 1; y <= x; y++) 
            System.out.print("*");
           System.out.println();
        }
    }
}