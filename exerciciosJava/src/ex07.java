import java.util.Scanner;

public class ex07 {
   public static void main (String[] args) throws Exception {
      // Create a code that checks if the number is even or odd
      Scanner scanner =  new Scanner(System.in);

      int 
         number, 
         account;

      System.out.print("Enter a number: ");
      number = scanner.nextInt();

      account = number % 2;

      if (account != 0) {
         System.out.print("This number is odd!");
      } else {
         System.out.print("This number is even!");
      }
   } 
}
