import java.util.Scanner;

public class ex23 {
   public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);

      int[][] matriz = new int[3][3];

      for(int i = 0; i < 3; i++) {
         for(int j = 0; j <3; j++) {
            System.out.print("Enter a value [ " + i + "  " + j + " ]: ");
            matriz[i][j] = scanner.nextInt();
         }
      }

      for(int i = 0; i < 3; i++){
         for(int j = 0; j < 3; j++) {
            System.out.print(matriz[i][j]);
         }
         System.out.println();
      }
   }
}
