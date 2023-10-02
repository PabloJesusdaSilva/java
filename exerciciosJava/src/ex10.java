import java.util.Scanner;

public class ex10 {
   public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a number");
      double number = scanner.nextDouble();

      if(number < 5 || number > 10) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
   }
}
