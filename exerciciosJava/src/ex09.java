import java.util.Scanner;

public class ex09 {
   public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);
      double number = scanner.nextDouble();

      if(number > 5 && number < 20) {
         System.out.println("True");
      } else {
         System.out.println("false");
      }
   }
}
