import java.util.Scanner;

public class ex25 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("1 - Portuguese \n2 - Spanish \nEnter a number: ");
      int numberOfTheLanguague = scanner.nextInt();

      switch(numberOfTheLanguague) {
         case 1:
            System.out.print(goodMorningInPortuguese());
            break;
         case 2:
            System.out.print(goodMorningInSpanish());
            break;
         default:
            System.out.print("Number of the language invalid!");
      }
   }

   static String goodMorningInPortuguese() {
      String goodMorning = "Bom dia!";

      return goodMorning;
   }

   static String goodMorningInSpanish() {
      String goodMorning =  "Buenos dias!";

      return goodMorning;
   }
}
