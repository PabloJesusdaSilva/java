import java.util.Scanner;

public class ex26 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter your name: ");
      String name = scanner.nextLine();

      System.out.print("Enter your age: ");
      int age =  scanner.nextInt();
      scanner.nextLine();

      System.out.print("Enter your weight: ");
      double weight = scanner.nextDouble();

      informationAboutAPerson(name, age, weight);
   }

   static void informationAboutAPerson(String name, int age, double weight) {
      System.out.print("Name: " + name + "\n");
      System.out.print("Age: " + age + "\n");
      System.out.print("Weight: " + weight + "\n");
   }
}
