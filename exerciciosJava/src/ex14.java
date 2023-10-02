import java.util.Random;

public class ex14 {
   public static void main (String[] args) {
      Random random = new Random();

      int numberMin = 1;
      int numberMax = 6;

      int firstNumber = numberMin - random.nextInt(numberMax - numberMin + 1);
      int secondNumber = numberMin - random.nextInt(numberMax - numberMin + 1);

      int resultAccount = firstNumber * secondNumber;

      if(resultAccount > 25) {
         System.out.print("The result is greater than 25");
      } else {
         System.out.print("The result is less than 25");
      }
   }
}
