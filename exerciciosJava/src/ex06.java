import java.util.Scanner;

public class ex06 {
   public static void main (String[] args) throws Exception {
      // Create a code that adds numbers interes and print on screen if it is greater than ten
      Scanner scanner = new Scanner(System.in);

      int
         firstNumber,
         secondNumber,
         accountResult;

      System.out.print("Enter the first number: ");
      firstNumber = scanner.nextInt();
      scanner.nextLine();

      System.out.print("Enter the second number: ");
      secondNumber = scanner.nextInt();
      scanner.nextLine();

      accountResult = firstNumber + secondNumber;

      if (accountResult > 10) {
         System.out.println("The number is greater than ten");
      } else {
         System.out.println("The number is less than ten");
      }
   }
}
