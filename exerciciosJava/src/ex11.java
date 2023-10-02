import java.util.Scanner;

public class ex11 {
   public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the first number: ");
      int firstNumber = scanner.nextInt();
      scanner.nextLine();

      System.out.print("Enter the second number: ");
      int secondNumber = scanner.nextInt();

      if(firstNumber > 10 || secondNumber > 10) {
         System.out.print("true");
      } else {
         System.out.print("false");
      }
   }
}
