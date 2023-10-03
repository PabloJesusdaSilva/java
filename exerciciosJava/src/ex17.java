import java.util.Scanner;

public class ex17 {
   public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the first number: ");
      int firstNumber = scanner.nextInt();
      scanner.nextLine();

      System.out.print("Enter the second number: ");
      int secondNumber = scanner.nextInt();

      while(firstNumber < secondNumber) {
         firstNumber++;
         System.out.print(firstNumber + "\n");
      }
   }
}