import java.util.Scanner;

public class ex08 {
   public static void main (String[] args) {
      // Create a function that countes the number of letters and say if it has more than 5 letters or not
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter your name: ");
      String name = scanner.nextLine();

      if(name.length() > 5) {
         System.out.print("This word has more than 5 letters");
      } else {
         System.out.println("This word has 5 letters or has less than 5 letters");
      }
   }
}
