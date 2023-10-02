import java.util.Scanner;

public class ex16 {
   public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);

      int num = 0;

      while(num < 100){
         System.out.println("Digite um número de 1 a 100");
         num = scanner.nextInt();
         num = num * 2;
      }
   }
}
