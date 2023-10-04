import java.util.Scanner;
import java.util.ArrayList;

public class ex22 {
   public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);

      ArrayList<Integer> listOfTheNumbers = new ArrayList<>();

      int number = 0;

      while(number != -1) {
         System.out.print("Enter a number: ");
         number = scanner.nextInt();

         if(number != -1) {
            listOfTheNumbers.add(number);
         }
      }

      for(int i = 0; i < listOfTheNumbers.size(); i++) {
         System.out.print(listOfTheNumbers.get(i));
      }
   }
}
