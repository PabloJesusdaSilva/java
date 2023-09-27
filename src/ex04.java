import java.util.Scanner;

class Main {
   public static void main (String[] args) {
      Scanner leitor = new Scanner(System.in);

      int 
         oneNumber, 
         twoNumber,
         treeNumber;

         System.out.print("Enter first number: ");
         oneNumber = leitor.nextInt();
         leitor.nextLine();

         System.out.print("Enter the second number: ");
         twoNumber = leitor.nextInt();
         leitor.nextLine();

         System.out.print("Enter the terciary number: ");
         treeNumber = leitor.nextInt();
         leitor.nextLine();

         System.out.println("The result of the account is: " + (oneNumber + twoNumber + treeNumber));
   }
}