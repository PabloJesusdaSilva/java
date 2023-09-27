import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) throws Exception {
        // Create code that adds three numbers and displays it on  the screen
        Scanner screen = new Scanner(System.in);

        String 
            firstName, 
            lastName;

        System.out.println("Enter your first name: ");
        firstName = screen.nextLine();

        System.out.println("Enter your last name:");
        lastName = screen.nextLine();

        System.out.println("Full name: " + firstName + " " + lastName);   
    }
}
