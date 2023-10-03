import java.util.Scanner;

public class ex19 {
   public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);

      int newValue;
      int sum = 0;

      for(int i = 0; i < 5; i++ ) {
         System.out.print("Enter a number: ");
         newValue = scanner.nextInt();

         sum += newValue;
      }

      System.out.print("The result of the sum is: " + sum);
   }
}
