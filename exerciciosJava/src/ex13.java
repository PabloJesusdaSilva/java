import java.util.Scanner;

public class ex13 {
   public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print(" 1 - Domingo\n 2 - Segunda feira\n 3 - Terça feira\n 4 - Quarta feira\n 5 - Quinta feira\n 6 - Sexta feira\n 7 - Sábado");
      System.out.print("\nEnter a number: ");
      int nameOfDay = scanner.nextInt();

      switch (nameOfDay) {
         case 1:
            System.out.print("Domingo");
            break;
         case 2:
            System.out.print("Segunda feira");
            break;
         case 3:
            System.out.print("Terça feira");
            break;
         case 4:
            System.out.print("Quarta feira");
            break;
         case 5:
            System.out.print("Quinta feira");
            break;
         case 6:
            System.out.print("Sexta feira");
            break;
         case 7:
            System.out.print("Sábado");
            break;
         default:
            System.out.print("Número inválido");
      }
   }
}
