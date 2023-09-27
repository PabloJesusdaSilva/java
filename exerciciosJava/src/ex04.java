import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int 
            firstNumber,
            secondNumber,
            thirdNumber,
            resultAccount;

        System.out.print("Enter the first number:");
        firstNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the third number: ");
        thirdNumber = scanner.nextInt();
        scanner.nextLine();

        resultAccount = firstNumber + secondNumber + thirdNumber;

        System.out.print("The result of the adds is: " + resultAccount);
    }
}
