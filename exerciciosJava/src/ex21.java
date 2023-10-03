import java.util.Scanner;

public class ex21 {
   public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);

      int[] numbers = {1, 2, 3, 4, 5};
      boolean notFound = false;

      System.out.print("Enter a number ");
      int sharedValue = scanner.nextInt();

      for(int i = 0; i < 5; i++) {
         if(numbers[i] == sharedValue){
            notFound = true;
         }
      }

      if(notFound) {
         System.out.println("Found!");
      } else {
         System.out.println("Not found!");
      }
   }
}
