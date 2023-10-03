import java.util.Scanner;

public class ex20 {
   public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);

      final String[] daysOfTheWeek = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

      System.out.print("Enter the number of a day of the week: ");
      int numberDayOfTheWeek = scanner.nextInt();

      System.out.print("The day is: " + daysOfTheWeek[numberDayOfTheWeek - 1]);
   }
}
